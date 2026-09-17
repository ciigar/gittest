package com.etc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Crayon
 * @ClassName SpringMvcConfig
 * @description
 * @date 2026/9/17 21:44
 */

@Configuration
@ComponentScan("com.etc.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
