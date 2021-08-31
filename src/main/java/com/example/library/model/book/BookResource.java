package com.example.library.model.book;

import lombok.Getter;
import lombok.Setter;

//di sicuro, altrimenti non posso salvare valori
@Setter
//dipende dalla configurazione della libreria Jackson perché potrebbe importare getter da sola
@Getter
public class BookResource {

  private Long id;
  private String title;
  private String author;
}
