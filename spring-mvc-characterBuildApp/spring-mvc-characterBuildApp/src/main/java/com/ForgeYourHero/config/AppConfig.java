package com.ForgeYourHero.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages="com.ForgeYourHero.repository")
@EntityScan(basePackages="com.ForgeYourHero.entity")
public class AppConfig {

}
