package com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.dao.IBookDAO;
import com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.modal.Book;
import com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.repository.BookRepository;

@Service
public class BookService implements IBookDAO {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public boolean saveBook(Book book) throws Exception {
		// TODO Auto-generated method stub
		return bookRepository.save(book) != null;
	}

	@Override
	public List<Book> getAllBooks() throws Exception {
		// TODO Auto-generated method stub
		List<Book> bookList = new ArrayList<Book>();
		bookRepository.findAll().forEach(book-> bookList.add(book));
		return bookList;
	}

	@Override
	public void deleteBook(String id) throws Exception {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		mongoTemplate.findAndRemove(query, Book.class);
	}

	@Override
	public Book getBook(String id) throws Exception {
		// TODO Auto-generated method stub
		Book getBook = mongoTemplate.findById(id, Book.class);
		return getBook;
	}
}
