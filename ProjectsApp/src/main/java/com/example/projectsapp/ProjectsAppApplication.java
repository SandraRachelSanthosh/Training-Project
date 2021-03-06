package com.example.projectsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProjectsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectsAppApplication.class, args);
    }

}
