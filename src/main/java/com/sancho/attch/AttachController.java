package com.sancho.attch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @author Jason, Moon
 * @since 2017-03-04.
 */
@Controller
public class AttachController {

    private final AttachService attachService;

    @Autowired
    public AttachController(AttachService attachService) {
        this.attachService = attachService;
    }

    @PostMapping("/attachments/attach")
    @ResponseBody
    public List<AttachFile> uploadAttachments(@RequestPart List<MultipartFile> files) throws IOException {
        return attachService.uploadAttachments(files);
    }
}
