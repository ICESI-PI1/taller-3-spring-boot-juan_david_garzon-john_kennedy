package com.edu.iceso.taller3.persistence.repositories.impl;

import com.edu.iceso.taller3.persistence.models.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class BookRepositoryImpl {

    private List<Book> books = new ArrayList<>();
    private AtomicLong nextId = new AtomicLong(1);

    public List<Book> getAllBooks() {
        return books;

    }

    public Optional<Book> getBookById(Long id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst();
    }

    public Book createBook(Book book) {
        book.setId(nextId.getAndIncrement());
        books.add(book);
        return book;
    }

    public Book updateBook(Long id, Book updatedBook) {
        Optional<Book> existingBook = getBookById(id);
        if (existingBook.isPresent()) {
            Book book = existingBook.get();
            book.setTitle(updatedBook.getTitle());
            book.setPublicationDate(updatedBook.getPublicationDate());
            book.setAuthor(updatedBook.getAuthor());
            return book;
        }
        return null;
    }

    public boolean deleteBook(Long id) {
        Optional<Book> bookToDelete = getBookById(id);
        if (bookToDelete.isPresent()) {
            books.remove(bookToDelete.get());
            return true;
        }
        return false;
    }
}

