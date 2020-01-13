package com.tistory.jeongpro.book.controller;

import javax.validation.ConstraintViolationException;
import javax.validation.constraints.Email;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class UserController {
	@GetMapping("/users/{id}")
	public String getUserInformationByPathVariable(@PathVariable("id") @Email String id) {
		return "hello";
	}
	@GetMapping("/users")
	public String getUserInformationByRequestParameter(@RequestParam("id") @Email String id) {
		return "world";
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ConstraintViolationException.class)
	public Object exception(Exception e) {
		return e.getMessage();
	}
}
