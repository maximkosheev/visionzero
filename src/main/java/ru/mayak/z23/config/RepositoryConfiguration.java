package ru.mayak.z23.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages = {"ru.mayak.z23.domain"})
@EnableJpaRepositories(basePackages = {"ru.mayak.z23.repositories"})
@EnableTransactionManagement()
public class RepositoryConfiguration {
}
