package com.lombok.lombokframeworkimplementation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data // Generates getters, setters, toString, equals, and hashCode methods for all fields.
@NoArgsConstructor // Generates a no-argument constructor.
@AllArgsConstructor // Generates a constructor with all arguments.
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    private int yearPublished;
}
