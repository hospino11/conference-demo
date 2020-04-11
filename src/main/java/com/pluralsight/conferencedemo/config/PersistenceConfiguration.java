package com.pluralsight.conferencedemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.logging.Level;
import java.util.logging.Logger;

@Configuration
public class PersistenceConfiguration {

    private static final Logger log = Logger.getLogger(PersistenceConfiguration.class.getName());

    @Value("${DB_NAME}")
    String dbName;

    @Value("${DB_HOST}")
    String dbHost;

    @Value("${DB_USERNAME}")
    String dbUserName;

    @Value("${DB_PASSWORD}")
    String dbPassword;

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://" + dbHost + "/" + dbName + "?useSSL=false&allowPublicKeyRetrieval=true");
        dataSourceBuilder.username(dbUserName);
        dataSourceBuilder.password(dbPassword);
        log.log(Level.INFO, "My custom datasource has been initialized and set up.");
        return dataSourceBuilder.build();
    }
}
