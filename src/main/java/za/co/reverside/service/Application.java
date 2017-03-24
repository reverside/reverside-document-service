package za.co.reverside.service;

import com.zenerick.service.DocumentService;

import com.mangofactory.swagger.plugin.EnableSwagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwagger
@DocumentService
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
