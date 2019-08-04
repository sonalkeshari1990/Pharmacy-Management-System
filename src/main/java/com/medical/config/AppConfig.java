package com.medical.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.medical.controller", "com.medical.model", "com.medical.service",
		"com.medical.dao"})
public class AppConfig {

}
