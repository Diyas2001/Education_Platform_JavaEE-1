package kz.bcc.bookcatalogservice.service;

import kz.bcc.bookcatalogservice.model.Book;

import java.util.List;

public interface BookCatalogService {

    List<Book> getAllBooks();
}
