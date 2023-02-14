package org.example.reproducer.mtsvb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class ReproducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReproducerApplication.class, args);
    }

}
