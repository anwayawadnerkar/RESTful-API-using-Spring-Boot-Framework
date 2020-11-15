package com.bajaj.bookstore.bookRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bajaj.bookstore.bookRest.entity.Book;
import com.bajaj.bookstore.bookRest.service.BookService;

@RestController
public class BookController 
{
	@Autowired
	BookService service;
	
	@GetMapping("/books")
	
	public List<Book>
	getAllBooks()     
	{         return service.getAllBooks();     } 
	
	@PostMapping("/books")     
	public Book insertBook(@RequestBody Book a)     
	{         return service.addBook(a);     }   
	
	@PutMapping("/books{id}")     
	public Book updateBook(@PathVariable("id")Integer id, @RequestBody Book a)     
	{         return service.editBook(a, id);     }    
	
	@RequestMapping(method=RequestMethod.GET,path="/books/{id}")     
	public Book getBookDetails(@PathVariable("id")Integer id) 
	{         return service.getBook(id);     }        
	
	@RequestMapping(method=RequestMethod.DELETE,path="/books/{id}")     
	public String removeAccount(@PathVariable("id")Integer id) 
	{
		service.deleteBook(id);
		return "Product Details are removed Successfully.....";     
	}  

}
