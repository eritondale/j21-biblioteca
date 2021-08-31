package com.example.library.app.bookendpoint;

import com.example.library.model.book.BookResource;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BooksController {
  //il controller dichiara le dipendenze solo verso gli orchestrator
  private final GetBookSingleOrchestrator getBookSingleOrchestrator;

  //il compito del controller è trasformare una request HTTP in oggetto Java
  //successivamente incapsulare l'oggetto Java risultato in una response HTTP
  //il tutto avviene grazie a Spring Web e la libreria Jackson

  @GetMapping("/{bookId}")
  ResponseEntity<BookResource> getBookSingle(@PathVariable Long bookId) {
    //Spring Web ha estratto tutti i valori dalla request HTTP
    //adesso il metodo del controller può eseguire l'orchestrator
    Optional<BookResource> book = this.getBookSingleOrchestrator.getBookSingle(bookId);
    //ottenuto il risultato Java, il controller con l'aiuto di Sptring Web
    //e della linreria Jackson trasforma il risultato Java
    //in un documento JSON e una responde HTTP
    return ResponseEntity.of(book);
  }

}
