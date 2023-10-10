package com.edu.iceso.taller3.controllers;



import com.edu.iceso.taller3.persistence.models.Author;
import com.edu.iceso.taller3.services.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/author")
public class AuthorController {

    private final IAuthorService authorService;

    @Autowired
    public AuthorController(IAuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public Optional<Author> getAuthorById(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return authorService.createAuthor(author);
    }

    @PutMapping("/{id}")
    public Optional<Author> updateAuthor(@PathVariable Long id, @RequestBody Author updatedAuthor) {
        return authorService.updateAuthor(id, updatedAuthor);
    }

    @DeleteMapping("/{id}")
    public boolean deleteAuthor(@PathVariable Long id) {
        return authorService.deleteAuthor(id);
    }
}
