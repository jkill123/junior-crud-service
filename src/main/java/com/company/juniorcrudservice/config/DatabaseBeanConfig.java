package com.company.juniorcrudservice.config;

import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;

//@Configuration
public class DatabaseBeanConfig {

//    @Bean
    public DataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setJdbcUrl("jdbc:postgresql://localhost:5434/dockerdb");
        dataSource.setUsername("user");
        dataSource.setPassword("pass");

        return dataSource;
    }
}
