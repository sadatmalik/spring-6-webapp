package com.creativefusion.spring6webapp.repositories;

import com.creativefusion.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author sm@creativefusion.net
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}