package com.lombok.lombokframeworkimplementation.repository;



import com.lombok.lombokframeworkimplementation.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long>{
}
