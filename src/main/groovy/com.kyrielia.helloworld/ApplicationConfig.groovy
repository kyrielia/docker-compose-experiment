package com.kyrielia.helloworld

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.session.data.redis.config.ConfigureRedisAction
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

/**
 * TODO: Document me
 *
 * @author Kyriacos Elia
 */
@Configuration
@EnableRedisHttpSession
class ApplicationConfig {

	@Bean
	static ConfigureRedisAction configureRedisAction() {

		ConfigureRedisAction.NO_OP;
	}
}
