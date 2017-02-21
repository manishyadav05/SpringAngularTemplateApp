package com.epcor.appservices.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@ComponentScan("com.epcor.appservices")
@PropertySource("classpath:application.properties")
public class AppConfig {

    private static final String PROPERTY_NAME_DATABASE_DRIVER = "spring.datasource.driver-class-name";
    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "spring.datasource.password";
    private static final String PROPERTY_NAME_DATABASE_URL = "spring.datasource.url";
    private static final String PROPERTY_NAME_DATABASE_USERNAME = "spring.datasource.username";


    @Resource
    private Environment env;

    /**
     @Bean
     public BoneCPDataSource boneCPDataSource() {

     BoneCPDataSource boneCPDataSource = new BoneCPDataSource();
     boneCPDataSource.setDriverClass(env.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
     boneCPDataSource.setJdbcUrl(env.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
     boneCPDataSource.setUsername(env.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
     boneCPDataSource.setPassword(env.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));
     boneCPDataSource.setIdleConnectionTestPeriodInMinutes(60);
     boneCPDataSource.setIdleMaxAgeInMinutes(420);
     boneCPDataSource.setMaxConnectionsPerPartition(30);
     boneCPDataSource.setMinConnectionsPerPartition(10);
     boneCPDataSource.setPartitionCount(3);
     boneCPDataSource.setAcquireIncrement(5);
     boneCPDataSource.setStatementsCacheSize(100);
     //boneCPDataSource.setReleaseHelperThreads(3);

     return boneCPDataSource;

     }
     */
    /**
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName(env.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
        dataSource.setUrl(env.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
        dataSource.setUsername(env.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
        dataSource.setPassword(env.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));

        return dataSource;
    }*/

}

