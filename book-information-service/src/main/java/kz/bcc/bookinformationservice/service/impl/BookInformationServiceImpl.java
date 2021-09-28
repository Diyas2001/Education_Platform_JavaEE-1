package kz.bcc.bookinformationservice.service.impl;

import kz.bcc.bookinformationservice.model.Book;
import kz.bcc.bookinformationservice.service.BookInformationService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BookInformationServiceImpl implements BookInformationService {

    @Override
    public Book getBookInformationById(Long id) {
        System.out.println("BookInformationServiceImpl.getBookInformationById");
        System.out.println("id = " + id);
        Book book = new Book();
        book.setId(id);
        book.setTitle("Title " + id);
        book.setDescription("Book description " + id);
        book.setAuthors(Arrays.asList("Author #" + id));
        return book;
    }
}
