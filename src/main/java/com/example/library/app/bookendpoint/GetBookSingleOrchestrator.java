package com.example.library.app.bookendpoint;

import com.example.library.model.book.BookResource;
import com.example.library.model.book.BookService;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

//Si potrebbe mettere anche Service ma mettiamo component per distinguerlo
//dai service con l'interface  che hanno poi implementazione annotata con l'annotation Service
@Component
@RequiredArgsConstructor
public class GetBookSingleOrchestrator {
  //l'orchestrator dichiara le dipendenze da tutti i service necessari
  private final BookService bookService;
  //non essendoci un interface nello stesso package potrei anche decidere
  //di dichiarare i metodi "package protected" oppure protected"
  public Optional<BookResource> getBookSingle(Long bookId) {
    //in un ambito didattico l'orchestrator non ha molto da fare
    //perché dipende da un unico service (Orchestrator = Controller)
    return this.bookService.readBookById(bookId);
  }
}
