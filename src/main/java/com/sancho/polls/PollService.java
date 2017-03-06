package com.sancho.polls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jason, Moon
 * @since 2017-03-06.
 */
@Service
public class PollService {
    private final PollMapper pollMapper;

    @Autowired
    public PollService(PollMapper pollMapper) {
        this.pollMapper = pollMapper;
    }

    public List<Poll> selectAll() {
        return pollMapper.selectAll();
    }
}
