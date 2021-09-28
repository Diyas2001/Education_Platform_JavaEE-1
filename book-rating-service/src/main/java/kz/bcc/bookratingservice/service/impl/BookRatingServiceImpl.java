package kz.bcc.bookratingservice.service.impl;

import kz.bcc.bookratingservice.service.BookRatingService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class BookRatingServiceImpl implements BookRatingService {

    @Override
    public Double getBookRatingById(Long id) {
        Random r = new Random();
        return 10.0 * r.nextDouble();
    }
}
