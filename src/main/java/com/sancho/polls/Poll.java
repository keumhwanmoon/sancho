package com.sancho.polls;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Jason, Moon
 * @since 2017-03-04.
 */
@Entity
@Table(name = "POLL")
@Getter
@Setter
public class Poll {

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

    @OneToMany(mappedBy = "poll")
    private List<PollOption> pollOptionList;

    @Column(name = "CRTN_DATE")
    private LocalDateTime creationDate;
}
