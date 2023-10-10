package com.edu.iceso.taller3.persistence.repositories.impl;

import com.edu.iceso.taller3.persistence.models.Author;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Repository
public class AuthorRepositoryImpl {

    private List<Author> authors = new ArrayList<>();
    private AtomicLong nextId = new AtomicLong(1);

    public List<Author> getAllAuthors() {
        return authors;
    }

    public Optional<Author> getAuthorById(Long id) {
        return authors.stream()
                .filter(author -> author.getId().equals(id))
                .findFirst();
    }

    public Author createAuthor(Author author) {
        author.setId(nextId.getAndIncrement());
        authors.add(author);
        return author;
    }

    public Author updateAuthor(Long id, Author updatedAuthor) {
        Optional<Author> existingAuthor = getAuthorById(id);
        if (existingAuthor.isPresent()) {
            Author author = existingAuthor.get();
            author.setName(updatedAuthor.getName());
            author.setNationality(updatedAuthor.getNationality());
            return author;
        }
        return null;
    }

    public boolean deleteAuthor(Long id) {
        Optional<Author> authorToDelete = getAuthorById(id);
        if (authorToDelete.isPresent()) {
            authors.remove(authorToDelete.get());
            return true;
        }
        return false;
    }

    public List<Author> getBooksByAuthor(Long id) {
        return authors.stream()
                .filter(author -> author.getId().equals(id))
                .collect(Collectors.toList());
    }
}

