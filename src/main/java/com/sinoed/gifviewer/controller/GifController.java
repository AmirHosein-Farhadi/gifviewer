package com.sinoed.gifviewer.controller;

import com.sinoed.gifviewer.repository.GifRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GifController {

    private final GifRepository gifRepository;

    public GifController(GifRepository gifRepository) {
        this.gifRepository = gifRepository;
    }

    @RequestMapping("/")
    public String homePage(Model model){

        return "home";
    }
}
