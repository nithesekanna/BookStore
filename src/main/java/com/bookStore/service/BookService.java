package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Book;
import com.bookStore.repostory.BookRepostory;

@Service
public class BookService {

	@Autowired
	private BookRepostory bRepo;
	
	public void save(Book b) {
		bRepo.save(b);
	}
	public List<Book> getAllBooks() {
		return bRepo.findAll();
	}
	
	public Book getbookbyId(int id) {
		return bRepo.findById(id).get();
	}
	
	public void deleteBook(int id) {
		bRepo.deleteById(id);
	}
}
