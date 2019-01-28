package com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.dao;

import java.util.List;
import com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.modal.Book;

public interface IBookDAO {
	
	public boolean saveBook(Book book) throws Exception;
	
	public void deleteBook(String id) throws Exception;
	
	public Book getBook(String id) throws Exception;
	
	public List<Book> getAllBooks() throws Exception;
}
