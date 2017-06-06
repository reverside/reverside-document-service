package za.co.reverside.service;

import com.zenerick.service.document.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Service
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
