package com.creativefusion.spring6webapp.services;

import com.creativefusion.spring6webapp.domain.Author;

/**
 * @author sm@creativefusion.net
 */
public interface AuthorService {
    Iterable<Author> findAll();
}
