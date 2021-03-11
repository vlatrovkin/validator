package com.example.validator.controller;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
public class ValidatorController {

    @PostMapping
    public Mono<Model> validate(@Valid @RequestBody Model model) {
        return Mono.just(model);
    }
}
