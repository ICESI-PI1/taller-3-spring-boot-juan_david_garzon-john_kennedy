package com.edu.iceso.taller3.services;


import com.edu.iceso.taller3.persistence.models.Author;

import java.util.List;
import java.util.Optional;

public interface IAuthorService {

    List<Author> getAllAuthors();

    Optional<Author> getAuthorById(Long id);

    Author createAuthor(Author author);

    Optional<Author> updateAuthor(Long id, Author updatedAuthor);

    boolean deleteAuthor(Long id);
}

