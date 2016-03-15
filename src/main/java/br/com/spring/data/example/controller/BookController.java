package br.com.spring.data.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.data.example.entity.Book;
import br.com.spring.data.example.service.IfBookService;

@RestController
public class BookController {
	
	@Autowired
	private IfBookService bookService;

	@RequestMapping(value = "/api/books/by/title", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<Book>> retrieveBooksByTitle(@Param("title") String title) {
		List<Book> books = bookService.findByTitle(title);
		return new ResponseEntity<>(books, HttpStatus.OK);
	}
	
	@RequestMapping(value = "api/books/save", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> saveNewBook(@Param("title") String title) {
		try {
			bookService.save(title);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
