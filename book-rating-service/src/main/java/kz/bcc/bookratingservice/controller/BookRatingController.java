package kz.bcc.bookratingservice.controller;

import kz.bcc.bookratingservice.service.BookRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book/rating")
public class BookRatingController {

    @Autowired
    private BookRatingService bookRatingService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookRatingById(@PathVariable Long id) {
        return ResponseEntity.ok(bookRatingService.getBookRatingById(id));
    }
}
