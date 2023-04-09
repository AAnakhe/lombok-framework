package com.lombok.lombokframeworkimplementation.service;

import com.lombok.lombokframeworkimplementation.model.Book;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface BookService {

    Book getBookById(Long id) throws ChangeSetPersister.NotFoundException;
    Book createBook(Book book);
}
