package com.sancho.ic;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Jason, Moon
 * @since 2017-03-04.
 */
@Entity
@Table(name = "INTEREST_CHECK")
@Getter
@Setter
public class InterestCheck {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "CATEGORY_CODE")
    private String categoryCode;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "BODY", columnDefinition = "longtext")
    private String body;

    @Column(name = "CRTN_DATE")
    private LocalDateTime creationDate;
}
