package com.songr.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Album {



    @GetMapping("/albums")
    public ModelAndView albums() {
        AlbumModel[] albums = {
                new AlbumModel("Thriller", "Michael Jackson", 9, 357, "https://upload.wikimedia.org/wikipedia/en/5/55/Michael_Jackson_-_Thriller.png"),
                new AlbumModel("Back in Black", "AC/DC", 10, 42*60+11, "https://upload.wikimedia.org/wikipedia/en/1/17/Acdcbackinblack.png"),
                new AlbumModel("Rumours", "Fleetwood Mac", 11, 40*60+1, "https://upload.wikimedia.org/wikipedia/en/0/04/FleetwoodMacRumours.PNG")
        };
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("albums");
        modelAndView.addObject("albums", albums);
        return modelAndView;
    }
}