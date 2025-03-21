package com.ayd2.library.repositories.author;

import com.ayd2.library.models.author.Author;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, UUID> {
}
