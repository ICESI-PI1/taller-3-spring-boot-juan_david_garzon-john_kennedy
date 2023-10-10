package com.edu.iceso.taller3.persistence.repositories;


import com.edu.iceso.taller3.persistence.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}

