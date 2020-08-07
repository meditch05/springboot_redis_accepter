package com.mw.session.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccepterController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("hello")
	public String hello(HttpSession session) {
		session.setAttribute("hello", "eric");
		return "hello eric!";
	}

	@GetMapping("/accepter")
	public String getCookie(HttpServletRequest req) {
		// HttpSession session = req.getSession(false);
		String sessionKey	= "sessionKey";
		String key			= "key";
		String value		= "value";
		
		for( Cookie cookie : req.getCookies()) {
			key 	= cookie.getName();
			value	= cookie.getValue();
			logger.info(key + "=" + value);
		}
		/*  HttpSession session =
		
		if ( session != null) {
			logger.info("get userId    = ", session.getAttribute("ID"));
			logger.info("get sessionId = ", session.getId());
		} else
			logger.info("session is null");
		*/
		
		return value;

	}
}
