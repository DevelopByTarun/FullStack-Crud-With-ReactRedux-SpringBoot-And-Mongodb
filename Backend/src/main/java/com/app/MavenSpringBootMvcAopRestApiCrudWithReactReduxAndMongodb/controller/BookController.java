package com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.dao.IBookDAO;
import com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.modal.Book;
import com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.repository.BookRepository;

@RestController
@RequestMapping("/api/book")
public class BookController {
	
	@Autowired
	private IBookDAO bookDAO;
	
	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping("/create")
	public ResponseEntity<Void> callSaveBook(@RequestBody Book book, UriComponentsBuilder builder) throws Exception {
		boolean flag = bookDAO.saveBook(book);
		if(flag == false) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/create?id={id}").buildAndExpand(book.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@GetMapping("/fetch")
	public ResponseEntity<List<Book>> callGetAllBooks() throws Exception {
		List<Book> bookList = bookDAO.getAllBooks();
		return new ResponseEntity<List<Book>>(bookList, HttpStatus.OK);
	}
	
	@PostMapping("/bookeu/{id}")
	public ResponseEntity<Book> callUpdateBook(@PathVariable("id") String id, @RequestBody Book book) throws Exception {
		Optional<Book> bookData = bookRepository.findById(id);
		if(bookData.isPresent()) {
			Book getBook = bookData.get();
			getBook.setTitle(book.getTitle());
			getBook.setDescription(book.getDescription());
			getBook.setAuthor(book.getAuthor());
			getBook.setPublished(book.getPublished());
			bookRepository.save(getBook);
			return new ResponseEntity<Book>(getBook, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/bookeu/{id}")
	public ResponseEntity<Book> callGetBook(@PathVariable("id") String id) throws Exception {
		Book bk = bookDAO.getBook(id);
		return new ResponseEntity<Book>(bk, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> callDeleteBook(@PathVariable("id") String id) throws Exception {
		bookDAO.deleteBook(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
