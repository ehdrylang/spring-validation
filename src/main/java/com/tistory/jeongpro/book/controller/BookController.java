package com.tistory.jeongpro.book.controller;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tistory.jeongpro.book.domain.dto.AddBookRequestDto;
import com.tistory.jeongpro.book.service.BookService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BookController {
	private BookService bookService;
	
	@PostMapping("/books")
	public void save(@RequestBody @Valid AddBookRequestDto addBookRequestDto, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			bindingResult.getAllErrors()
				.forEach(objectError->{
					System.err.println("code : " + objectError.getCode());
					System.err.println("defaultMessage : " + objectError.getDefaultMessage());
					System.err.println("objectName : " + objectError.getObjectName());
				});
			return;
		}
		bookService.save(addBookRequestDto.toEntity());
	}
}
