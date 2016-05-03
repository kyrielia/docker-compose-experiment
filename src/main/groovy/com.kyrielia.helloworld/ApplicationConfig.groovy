package com.kyrielia.helloworld

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory
import org.springframework.session.data.redis.config.ConfigureRedisAction
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

@Configuration
@EnableRedisHttpSession
class ApplicationConfig {

	@Bean
	public JedisConnectionFactory connectionFactory() {

		new JedisConnectionFactory(hostName: "redis")
	}

	@Bean
	static ConfigureRedisAction configureRedisAction() {

		ConfigureRedisAction.NO_OP;
	}
}
