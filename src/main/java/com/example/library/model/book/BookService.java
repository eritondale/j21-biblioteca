package com.example.library.model.book;

import java.util.Optional;

//Interface che non deve essere trovata quindi non sta sotto l'alber di app che viene scanned
public interface BookService {
  //deve trovare bookresource paertendo dall'id
  //si consiglia di usare java.util.optional
  Optional<BookResource> readBookById(Long bookId);

}
