package com.tistory.jeongpro.book.service;

import org.springframework.stereotype.Service;

import com.tistory.jeongpro.book.domain.entity.Book;
import com.tistory.jeongpro.book.repository.BookRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {
	private BookRepository bookRepository;
	@Override
	public void save(Book book) {
		bookRepository.save(book);
	}
}
