package br.com.spring.data.example.service;

import java.util.List;

import br.com.spring.data.example.entity.Book;

public interface IfBookService {
	
	List<Book> findByTitle(String title);
	Book save(String title);

}
