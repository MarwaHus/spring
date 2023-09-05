package com.songr.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class Album {
    @GetMapping("/albums")
    public String albums(Model m) {
        AlbumModel a1 = new AlbumModel("Justice", "Justin Bieber", 16, 52 * 60 + 34, "https://upload.wikimedia.org/wikipedia/en/5/5c/Justice_by_Justin_Bieber.png");

        AlbumModel a2 = new AlbumModel("lovely", "Billie Eilish, Khalid", 16, 56 * 60 + 17, "https://th.bing.com/th?q=Lovely+Song+Lyrics+Billie+Eilish+and+Khalid&w=120&h=120&c=1&rs=1&qlt=90&cb=1&pid=InlineBlock&mkt=en-XA&cc=JO&setlang=en&adlt=strict&t=1&mw=247");

        AlbumModel a3 = new AlbumModel("Red (Taylor's Version)", "Taylor Swift", 30, 106 * 60 + 18, "https://upload.wikimedia.org/wikipedia/en/thumb/a/a6/Red_Taylor%27s_Version.png/220px-Red_Taylor%27s_Version.png");

        m.addAttribute("albums", new AlbumModel[]{a1, a2, a3});
        return "album";
    }
    }
