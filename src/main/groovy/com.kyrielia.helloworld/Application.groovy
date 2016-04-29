package com.kyrielia.helloworld

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.session.SessionRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE
import static org.springframework.web.bind.annotation.RequestMethod.GET

@SpringBootApplication
@RestController
class Application {

	@Autowired
	private SessionRepository sessionRepository;

	@RequestMapping(value = "/", method = GET, produces = TEXT_PLAIN_VALUE)
	String helloWorld() {

		def session = sessionRepository.createSession()
		return "Hello there! You are session number ${session.id}"
	}

	static void main(String[] args) {

		SpringApplication.run Application, args
	}
}
