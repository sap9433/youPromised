package com.saptarshi.youpromised;

import com.saptarshi.youpromised.config.AppSettings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.saptarshi.youpromised.model.AllPromises;
import com.saptarshi.youpromised.model.Promise;

@SpringBootApplication
@RequestMapping("/")
@RestController
@ConfigurationProperties(prefix = "app.setting")
public class YoupromisedApplication {


	@Autowired
	AllPromises promise;
	@Autowired
	AppSettings appSettings;

	public static void main(String[] args) {
		SpringApplication.run(YoupromisedApplication.class, args);
	}
	@GetMapping 
	String 	wola() {
		return "Hello World6";
	}

	@GetMapping(path = "/promise", produces = "application/json")
	
	public Collection<Promise> 	greeting() {
		return promise.getAll();
	}

	@GetMapping(path = "/settings", produces = "application/json")
	public Map<String, Boolean> settings() {
		return appSettings.getFeatures();
	}

	@Autowired
	public YoupromisedApplication(AppSettings appSettings) {
		this.appSettings = appSettings;
	}

}
