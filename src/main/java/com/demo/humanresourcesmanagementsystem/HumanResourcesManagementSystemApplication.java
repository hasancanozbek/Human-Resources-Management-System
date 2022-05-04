package com.demo.humanresourcesmanagementsystem;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "HRMS API", version = "1.0", description = "Human Resources Management System"))
public class HumanResourcesManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(HumanResourcesManagementSystemApplication.class, args);
    }

    //ToDo : Mernis entegrasyonu yapılacak.
    //ToDo : Fotoğraf yükleme servisi entegrasyonu eklenecek.
}
