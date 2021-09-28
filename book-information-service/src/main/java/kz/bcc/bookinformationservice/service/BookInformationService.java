package kz.bcc.bookinformationservice.service;

import kz.bcc.bookinformationservice.model.Book;

public interface BookInformationService {

    Book getBookInformationById(Long id);
}
