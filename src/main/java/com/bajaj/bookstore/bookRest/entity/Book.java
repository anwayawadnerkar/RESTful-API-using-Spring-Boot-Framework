package com.bajaj.bookstore.bookRest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Books")
public class Book 
{
	@Id
	private Integer id;
	private String name;
	private String author;
	private String pub;
	private String category;
	private int pages;
	private int price;
	
	public Book()
	{	}

	public Book(Integer id, String name, String author, String pub, String category, int pages, int price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.pub = pub;
		this.category = category;
		this.pages = pages;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", pub=" + pub + ", category=" + category
				+ ", pages=" + pages + ", price=" + price + "]";
	}
	
	
}
