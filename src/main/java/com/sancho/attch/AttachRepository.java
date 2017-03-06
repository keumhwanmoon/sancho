package com.sancho.attch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Jason, Moon
 * @since 2017-03-06.
 */
@Repository
public interface AttachRepository extends JpaRepository<AttachFile, Long> {
}
