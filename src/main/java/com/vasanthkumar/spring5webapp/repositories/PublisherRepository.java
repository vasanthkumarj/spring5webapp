package com.vasanthkumar.spring5webapp.repositories;

import com.vasanthkumar.spring5webapp.model.Publishers;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publishers,Long> {
}
