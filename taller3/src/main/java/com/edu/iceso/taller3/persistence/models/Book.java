package com.edu.iceso.taller3.persistence.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Date publicationDate;
    @ManyToOne
    private Author author;

}

