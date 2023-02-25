package com.creativefusion.spring6webapp.repositories;

import com.creativefusion.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author sm@creativefusion.net
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
