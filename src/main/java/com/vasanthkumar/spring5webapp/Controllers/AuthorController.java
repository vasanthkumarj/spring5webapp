package com.vasanthkumar.spring5webapp.Controllers;

import com.vasanthkumar.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping(value ="/authors")
    public String showAuthors(Model model)
    {
        model.addAttribute("Authors",authorRepository.findAll());
        return "Authors";
    }
}
