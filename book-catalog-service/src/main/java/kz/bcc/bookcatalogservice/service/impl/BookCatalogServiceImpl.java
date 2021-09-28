package kz.bcc.bookcatalogservice.service.impl;

import kz.bcc.bookcatalogservice.model.Book;
import kz.bcc.bookcatalogservice.service.BookCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookCatalogServiceImpl implements BookCatalogService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Book> getAllBooks() {
        List<Book> bookList = new ArrayList<>();

        List<Long> bookIds = new ArrayList<>(Arrays.asList(1L, 2L, 4L));
        for (Long id : bookIds) {
            Book book = restTemplate.getForObject("http://localhost:8082/books/" + id, Book.class);
            Double rating = restTemplate.getForObject("http://book-rating-service/book/rating/" + id, Double.class);
            book.setRating(rating);
            bookList.add(book);
        }

        return bookList;
//        return Arrays.asList(
//                new Book(1L, "Abay joly", "Abay joly description", Arrays.asList("Auezov")),
//                new Book(2L, "Abay joly 2", "Abay joly description 2", Arrays.asList("Auezov 2"))
//        );
    }
}
