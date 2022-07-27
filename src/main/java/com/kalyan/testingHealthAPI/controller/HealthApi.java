package com.kalyan.testingHealthAPI.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/responseTesting")
public class HealthApi {

	@GetMapping(value = {"", "/", "/health-check"})
	public ResponseEntity<Object> healthCheck() {
		return new ResponseEntity<Object>("{\"status\": true, \"message\":\"Server is Working fine.\"}", HttpStatus.OK);
	}
}
