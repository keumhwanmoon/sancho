package com.sancho.polls;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jason, Moon
 * @since 2017-03-06.
 */
@Mapper
@Repository
public interface PollMapper {
    @SelectProvider(type = PollSQL.class, method = "selectAll")
    public List<Poll> selectAll();
}
