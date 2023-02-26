package com.creativefusion.spring6webapp.services;

import com.creativefusion.spring6webapp.domain.Book;

/**
 * @author sm@creativefusion.net
 */
public interface BookService {
    Iterable<Book> findAll();
}
