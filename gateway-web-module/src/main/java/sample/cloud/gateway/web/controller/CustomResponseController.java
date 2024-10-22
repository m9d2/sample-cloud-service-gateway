package sample.cloud.gateway.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class CustomResponseController {

    @GetMapping("/rate-limit-response")
    public Mono<ResponseEntity<String>> customRateLimitResponse() {
        return Mono.just(ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body("You have exceeded the request limit. Please try again later."));
    }
}