package za.co.reverside.service;

import com.mangofactory.swagger.plugin.EnableSwagger;
import com.zenerick.service.document.DocumentService;

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
