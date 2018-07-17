package br.com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.api.GreetingApi;
import br.com.example.api.GreetingDto;

@RestController
final class GreetingController {

	private final GreetingApi greeting;

	@Autowired
	GreetingController(final GreetingApi greeting) {
		this.greeting = greeting;
	}

	@RequestMapping("/greeting")
	GreetingDto greeting(@RequestParam(value = "name", defaultValue = "World") final String name) {
		return this.greeting.run(name);
	}

}
