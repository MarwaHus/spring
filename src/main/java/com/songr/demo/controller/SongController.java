package com.songr.demo.controller;

import com.songr.demo.repositories.AlbumStoreInterface;
import com.songr.demo.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
public class SongController {
    @Autowired
    private SongRepository songRepository;

    @Autowired
    private AlbumStoreInterface albumStoreInterface;
    private long id;
    private String title;
    private int length;
    private int trackNumber;


    @GetMapping("/songs")
    public String getAllSongs(Model model) {
        List<Song> songs = songRepository.findAll();
        model.addAttribute("songs", songs);
        return "song";
    }
    @PostMapping("/albums/{id}/addSong")
    public RedirectView addSongToAlbum(@PathVariable("id") long id, String title, int length,int trackNumber ) {
        Optional<AlbumModel> album = albumStoreInterface.findById(id);
        if (album.isPresent()) {
            Song song = new Song(title,  length, trackNumber);
            album.get().addSong(song);
            songRepository.save(song);
            albumStoreInterface.save(album.get());
        }
        return new RedirectView("/album/" + id);
    }


}