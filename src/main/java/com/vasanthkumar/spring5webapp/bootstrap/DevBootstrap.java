package com.vasanthkumar.spring5webapp.bootstrap;

import com.vasanthkumar.spring5webapp.model.Authors;
import com.vasanthkumar.spring5webapp.model.Books;
import com.vasanthkumar.spring5webapp.model.Publishers;
import com.vasanthkumar.spring5webapp.repositories.AuthorRepository;
import com.vasanthkumar.spring5webapp.repositories.BookRepository;
import com.vasanthkumar.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Publishers publishers=new Publishers("rupa publications",
                "india");
        publisherRepository.save(publishers);
        Authors authors = new Authors("chetan");
        Books books = new Books("two states",
                "10546",
                publishers);
        authors.getBooks().add(books);
        books.getAuthors().add(authors);
        authorRepository.save(authors);
        bookRepository.save(books);
    }
}
