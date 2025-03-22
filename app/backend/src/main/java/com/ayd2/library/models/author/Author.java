package com.ayd2.library.models.author;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Author")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    
    @Id
    @GeneratedValue
    private String id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(length = 100)
    private String nationality;

    private LocalDate birthDate;
}
