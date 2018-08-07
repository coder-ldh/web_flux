package com.ldh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @Author: ldh Created on 2018/8/7
 */
@RestController
public class IndexController {

  @GetMapping("/hello")
  public Mono<String> hello() {
    return Mono.just("Welcome to reactive world ~");
  }
}