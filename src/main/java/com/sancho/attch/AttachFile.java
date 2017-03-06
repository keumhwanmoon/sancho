package com.sancho.attch;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Jason, Moon
 * @since 2017-03-04.
 */
@Entity
@Table(name = "ATTCH_FILE")
@Getter
@Setter
public class AttachFile {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "STRD_FOLDER_NAME")
    private String storedFolderName;

    @Column(name = "ORG_FILE_NAME")
    private String originalFileName;

    @Column(name = "STRD_FILE_NAME")
    private String storedFileName;

    @Column(name = "FILE_EXTENSION")
    private String fileExtension;

    @Column(name = "FILE_SIZE")
    private Long fileSize;

    @Column(name = "FILE_CTT_TYPE")
    private String fileContentType;
}
