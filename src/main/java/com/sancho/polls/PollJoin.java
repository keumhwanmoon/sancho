package com.sancho.polls;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Jason, Moon
 * @since 2017-03-04.
 */
@Entity
@Table(name = "INTEREST_CHECK_JOIN")
@Getter
@Setter
public class PollJoin {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "INTEREST_CHECK_ID")
    private Long interestCheckId;

    @Column(name = "EMAIL_ADDRS")
    private String emailAddress;

    @Column(name = "QUANTITY")
    private Long quantity;
}
