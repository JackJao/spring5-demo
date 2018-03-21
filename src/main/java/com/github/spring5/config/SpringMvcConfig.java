package com.github.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by verse on 2018/3/21.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.github.spring5.controller")
public class SpringMvcConfig implements WebMvcConfigurer {
}
