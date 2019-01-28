package com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.modal.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

}
