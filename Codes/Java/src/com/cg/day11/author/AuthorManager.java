package com.cg.day11.author;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AuthorManager {

	public AuthorManager() {
		
	}
	
	Map<String, Author> authorList = new ConcurrentHashMap<String, Author>();
	
	public void addAuthor(String name, String email, char gender) {
		Author author = new Author(name, email, gender);
		validateAuthor(author);
		checkIfAuthorAlreadyExists(author);
		authorList.put(generateKey(author), author);
	}

	private void checkIfAuthorAlreadyExists(Author author) {
		if (authorList.containsKey(generateKey(author))) {
			throw new RuntimeException("Author already exists...");
		}
		
	}

	private String generateKey(Author author) {
		return String.format("%s-%s", author.getEmail(), author.getName());
	}

	private void validateAuthor(Author author) {
		author.validateName();
		author.validateEmail();
		author.validateGender();
	}
	
	public Collection<Author> getAllAuthors() {
		return authorList.values();
	}
}