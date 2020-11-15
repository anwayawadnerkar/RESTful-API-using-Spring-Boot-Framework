package com.bajaj.bookstore.bookRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bajaj.bookstore.bookRest.entity.Book;
import com.bajaj.bookstore.bookRest.repository.BookRepository;

@Service
public class BookService 
{
	@Autowired 
	BookRepository repo;
	
	public List<Book> 
	
	getAllBooks()     
	{         return  repo.findAll();     }     

	public Book addBook(Book a)     
	{         return  repo.save(a);     }     

	public Book editBook(Book a, Integer id)      
	{         return repo.save(a);     }     

	public Book getBook(Integer id) 
	{         return  repo.findById(id).get();     }          

	public void deleteBook(Integer id) 
	{          repo.deleteById(id);     }
}
