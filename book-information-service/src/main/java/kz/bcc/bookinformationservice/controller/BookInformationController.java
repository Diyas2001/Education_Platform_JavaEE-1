package kz.bcc.bookinformationservice.controller;

import kz.bcc.bookinformationservice.service.BookInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookInformationController {

    @Autowired
    private BookInformationService bookInformationService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookInformationById(@PathVariable Long id) {

        return ResponseEntity.ok(bookInformationService.getBookInformationById(id));
    }
}
