package com.vasanthkumar.spring5webapp.repositories;

import com.vasanthkumar.spring5webapp.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books,Long> {
}
