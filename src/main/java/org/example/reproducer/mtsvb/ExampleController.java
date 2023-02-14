package org.example.reproducer.mtsvb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class ExampleController {
    @GetMapping
    Mono<String> hello() {
        return Mono.just("world");
    }
}
