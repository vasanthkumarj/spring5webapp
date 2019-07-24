package com.vasanthkumar.spring5webapp.repositories;

import com.vasanthkumar.spring5webapp.model.Authors;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Authors,Long> {
}
