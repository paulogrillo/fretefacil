package br.com.fretefacil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class FretefacilApplication {

    public static void main(String[] args) {
        SpringApplication.run(FretefacilApplication.class, args);
    }
    @GetMapping("/test")
    public String getController(){
        return "Hello Wolrd!";
    }
}
