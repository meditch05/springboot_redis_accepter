package com.mw.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
public class RedisSessionExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSessionExamApplication.class, args);
	}

}
