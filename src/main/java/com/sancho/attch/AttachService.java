package com.sancho.attch;

import com.sancho.config.properties.AttachProperties;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;
;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jason, Moon
 * @since 2017-03-04.
 */
@Service
@EnableConfigurationProperties(AttachProperties.class)
public class AttachService {

    private final AttachRepository repository;

    private final AttachProperties attachProperties;

    @Autowired
    public AttachService(AttachRepository repository, AttachProperties attachProperties) {
        this.repository = repository;
        this.attachProperties = attachProperties;
    }

    public List<AttachFile> uploadAttachments(List<MultipartFile> sourceFiles) throws IOException {

        List<AttachFile> attachFiles = new ArrayList<>();
        sourceFiles.forEach(sourceFile -> {
            String sourceFileName = sourceFile.getOriginalFilename();
            String sourceFileNameExtension = FilenameUtils.getExtension(sourceFileName).toLowerCase();

            File destinationFile;
            String destinationFileName;

            do {
                destinationFileName = RandomStringUtils.randomAlphanumeric(32) + "." + sourceFileNameExtension;
                destinationFile = new File(attachProperties.getPath() + destinationFileName);
            } while (destinationFile.exists());

            destinationFile.getParentFile().mkdirs();

            try {
                sourceFile.transferTo(destinationFile);
            } catch (IOException e) {
                e.printStackTrace();
            }

            AttachFile attachFile = new AttachFile();

            attachFile.setOriginalFileName(sourceFile.getOriginalFilename());
            attachFile.setStoredFileName(destinationFileName);
            attachFile.setFileSize(sourceFile.getSize());
            attachFile.setFileContentType(sourceFile.getContentType());
            attachFile.setFileExtension(sourceFileNameExtension);

            repository.save(attachFile);
        });


        return attachFiles;
    }
}
