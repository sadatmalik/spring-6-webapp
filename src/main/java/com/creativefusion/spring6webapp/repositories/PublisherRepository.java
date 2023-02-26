package com.creativefusion.spring6webapp.repositories;

import com.creativefusion.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author sm@creativefusion.net
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
