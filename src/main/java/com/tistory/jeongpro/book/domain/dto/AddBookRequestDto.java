package com.tistory.jeongpro.book.domain.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.tistory.jeongpro.book.domain.entity.Book;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AddBookRequestDto {
	
	@NotBlank(message="title is mandatory")
	@Size(max=100, message="title size must be less than 500 charactors")
	private String title;
	
	@NotNull(message = "author is not null")
	private String author;
	
	public Book toEntity() {
		return Book.builder()
			.title(this.title)
			.author(this.author)
			.build();
	}
}