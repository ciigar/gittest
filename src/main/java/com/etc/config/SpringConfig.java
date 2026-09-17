package com.etc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Crayon
 * @ClassName SpringConfig
 * @description
 * @date 2026/9/17 21:29
 */

@Configuration
@ComponentScan("com.etc.service")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}
