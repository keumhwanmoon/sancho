package com.sancho.polls;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author Jason, Moon
 * @since 2017-03-06.
 */
@Entity
@Table(name = "POLL_OPTION")
@Data
public class PollOption {
    @Id
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POLL_ID")
    private Poll poll;

    @Column(name = "PRODUCT_NAME")
    private String name;

    @Column(name = "PRODUCT_DESCRIPTION")
    private String description;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "POLL_OPTION_IMAGE", foreignKey = @ForeignKey (name = "FK_POLL_OPTION_IMAGE"),
            joinColumns = {
                    @JoinColumn(name = "POLL_OPTION_ID", referencedColumnName = "ID"),
            })
    @Column(name = "IMAGE", columnDefinition = "longText")
    private List<Long> attachmentsFileIds;
}
