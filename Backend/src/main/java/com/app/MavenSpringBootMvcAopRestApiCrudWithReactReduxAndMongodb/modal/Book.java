package com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "SBRRCrud_Book")
@TypeAlias("book")
public class Book {
	
	@Id
	private String id;

	@Field(value = "Book_Title")
	private String title;
	
	@Field(value = "Book_Description")
	private String description;
	
	@Field(value = "Book_Author")
	private String author;
	
	@Field(value = "Book_Published")
	private int published;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the published
	 */
	public int getPublished() {
		return published;
	}

	/**
	 * @param published the published to set
	 */
	public void setPublished(int published) {
		this.published = published;
	}
}
