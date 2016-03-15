package br.com.spring.data.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.google.common.base.Optional;

import br.com.spring.data.example.entity.Book;
import br.com.spring.data.example.sql.BookSQLConstants;

public interface BookRepository extends BaseRepository<Book, Long> {

	@Query(value = BookSQLConstants.SQL_FIND_TITLE_BY_ID, nativeQuery = true)
	Optional<String> findTitleById(@Param("id") Long id);

	@Query(value = BookSQLConstants.SQL_FIND_BOOK_BY_TITLE, nativeQuery = true)
	List<Book> findBookByTitle(@Param("title") String title);

	long countByTitle(String title);

	List<Book> findDistinctByTitle(String title);

	List<Book> findFirst3ByTitleOrderByTitleAsc(String title);

	List<Book> findTop10ByTitleOrderByTitleAsc(String title);

}
