package com.tistory.jeongpro.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tistory.jeongpro.book.domain.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
