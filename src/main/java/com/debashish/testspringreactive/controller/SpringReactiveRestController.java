package com.debashish.testspringreactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

/**
 * @author forde
 *
 */
@RequestMapping("/base")
@RestController
public class SpringReactiveRestController {

	@GetMapping("/flux")
	public Flux<Integer> getFlux() {
		return Flux.just(1, 2, 3);
	}
}
