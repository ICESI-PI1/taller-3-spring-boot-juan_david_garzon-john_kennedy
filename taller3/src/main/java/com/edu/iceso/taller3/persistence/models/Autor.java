package com.edu.iceso.taller3.persistence.models;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nationality;

}
