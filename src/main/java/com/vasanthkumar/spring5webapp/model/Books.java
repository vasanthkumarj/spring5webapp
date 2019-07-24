package com.vasanthkumar.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isbn;
    @OneToOne
    private Publishers publishers;
    @ManyToMany
    @JoinTable(name = "book_author",joinColumns = @JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name="author_id"))
    private Set<Authors> authors=new HashSet<>();

    public Books() {
    }

    public Books(String title, String isbn, Publishers publishers) {
        this.title = title;
        this.isbn = isbn;
        this.publishers = publishers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Publishers getPublishers() {
        return publishers;
    }

    public void setPublishers(Publishers publishers) {
        this.publishers = publishers;
    }

    public Set<Authors> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Authors> authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Books)) return false;
        Books books = (Books) o;
        return Objects.equals(getId(), books.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authors=" + authors +
                '}';
    }
}
