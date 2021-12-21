package com.ForgeYourHero.springmvccharacterBuildApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.ForgeYourHero")
@SpringBootApplication
public class SpringMvcCharacterBuildAppApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	return application.sources(SpringMvcCharacterBuildAppApplication.class);
}

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcCharacterBuildAppApplication.class, args);
	}

}
