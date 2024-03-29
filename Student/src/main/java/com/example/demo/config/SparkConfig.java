package com.example.demo.config;

import org.apache.spark.sql.SparkSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SparkConfig {

    @Bean
    public SparkSession sparkSession() {
        return SparkSession.builder()
                .appName("LibraryManagementSystem")
                .master("local[*]")  // Change to an appropriate master URL in a production environment
                .getOrCreate();
    }
}

