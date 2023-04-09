package com.lombok.lombokframeworkimplementation.service.Impl;

import com.lombok.lombokframeworkimplementation.model.Book;
import com.lombok.lombokframeworkimplementation.repository.BookRepository;
import com.lombok.lombokframeworkimplementation.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;


    @Override
    public Book getBookById(Long id) throws ChangeSetPersister.NotFoundException {
        try {
            Optional<Book> book = bookRepository.findById(id);
            if (book.isPresent()) {
                return book.get();
            } else {
                throw new ChangeSetPersister.NotFoundException();
            }
        } catch (Exception e) {
            throw new ChangeSetPersister.NotFoundException();
        }
    }

    @Override
    public Book createBook(Book book) {
        try {
            Book newBook = new Book();
            newBook.setTitle(book.getTitle());
            newBook.setAuthor(book.getAuthor());
            newBook.setYearPublished(book.getYearPublished());
            return bookRepository.save(newBook);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create book", e);
        }
    }

}
