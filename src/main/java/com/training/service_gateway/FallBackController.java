package com.training.service_gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallBackController {

    @PostMapping("/orderFallback")
    public Mono<String> orderFallBack(){
        return Mono.just("Order service is down,Please try in sometimes!!");
    }

    @PostMapping("/paymentFallback")
    public Mono<String> paymentFallBack(){
        return Mono.just("Payment service is down,Please try in sometimes!!");
    }
}
