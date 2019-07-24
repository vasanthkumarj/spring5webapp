package com.vasanthkumar.spring5webapp.Controllers;


import com.vasanthkumar.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BookRepository bookRepository;


    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(value = "/books")
    public String showBooks(Model model)
    {
        model.addAttribute("Books",bookRepository.findAll());
        return "Books";
    }
}
