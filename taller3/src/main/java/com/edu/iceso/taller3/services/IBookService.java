package com.edu.iceso.taller3.services;


import com.edu.iceso.taller3.persistence.models.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {

    List<Book> getAllBooks();

    Optional<Book> getBookById(Long id);

    Book createBook(Book book);

    Optional<Book> updateBook(Long id, Book updatedBook);

    boolean deleteBook(Long id);
}
