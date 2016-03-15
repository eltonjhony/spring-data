package br.com.spring.data.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.spring.data.example.entity.Book;
import br.com.spring.data.example.repository.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements IfBookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> findByTitle(String title) {
		return bookRepository.findBookByTitle(title);
	}

	@Override
	public Book save(String title) {
		Book book = new Book(title);
		return bookRepository.save(book);
	}

}
