package com.edu.iceso.taller3.persistence.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Date fechaPublicacion;
    @ManyToOne
    private Autor autor;

}

