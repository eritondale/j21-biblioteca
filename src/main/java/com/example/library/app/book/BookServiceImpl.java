package com.example.library.app.book;

import com.example.library.model.book.BookResource;
import com.example.library.model.book.BookService;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

  @Override
  public Optional<BookResource> readBookById(Long bookId) {
    //emulazione
    switch(bookId.intValue()) {
      case 1:
        BookResource it = new BookResource();
        it.setId(bookId);
        it.setTitle("Un sacchetto di biglie");
        it.setAuthor("Joseph Joffo");
        return Optional.of(it);
      case 2:
        BookResource hp = new BookResource();
        hp.setId(bookId);
        hp.setTitle("Harry Potter e la pietra filosofale");
        hp.setAuthor("J. K. Rowling");
        return Optional.of(hp);
      default:
        return Optional.empty();
    }
  }
}
