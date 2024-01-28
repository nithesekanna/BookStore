package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repostory.MyBookRepository;

@Service
public class MyBookListService {

	@Autowired
	private MyBookRepository mybook;
	
	public void savemybook(MyBookList book) {
		mybook.save(book);
	}
	
	public List<MyBookList> getAllbooks(){
		return mybook.findAll();
	}
	
	public void deleteBook(int id) {
	    mybook.deleteById(id);
	}
}
