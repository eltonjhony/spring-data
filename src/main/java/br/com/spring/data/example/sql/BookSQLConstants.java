package br.com.spring.data.example.sql;

public class BookSQLConstants {

	public static final String SQL_FIND_BOOK_BY_TITLE = "SELECT * "
			+ " FROM BOOK_TBL "
			+ " WHERE TITLE = :title ";
	
	public static final String SQL_FIND_TITLE_BY_ID = "SELECT "
			+ "	TITLE "
			+ " FROM BOOK_TBL "
			+ " WHERE ID = :id ";
}
