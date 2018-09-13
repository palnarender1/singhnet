package com.aws.codestar.projecttemplates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * Simple class to start up the application.
 *
 * @SpringBootApplication adds:
 * @Configuration
 * @EnableAutoConfiguration
 * @ComponentScan
 */
@SpringBootApplication(scanBasePackages = { "com.aws"})
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public UrlBasedViewResolver urlBasedViewResolver() {
		UrlBasedViewResolver res = new InternalResourceViewResolver();
		res.setViewClass(JstlView.class);
		res.setPrefix("/WEB-INF/jsp/");
		res.setSuffix(".jsp");

		return res;
	}

}
