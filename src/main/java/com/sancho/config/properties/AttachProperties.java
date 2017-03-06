package com.sancho.config.properties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Jason, Moon
 * @since 2017-03-06.
 */
@ConfigurationProperties(prefix = AttachProperties.PREFIX)
@Getter
@Setter
public class AttachProperties {
    public static final String PREFIX = "attach";

    private String path;
}
