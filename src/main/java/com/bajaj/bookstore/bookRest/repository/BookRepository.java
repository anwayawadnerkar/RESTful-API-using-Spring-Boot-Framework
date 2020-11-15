package com.bajaj.bookstore.bookRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bajaj.bookstore.bookRest.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> 
{

}
