package com.songr.demo.controller;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int length;
    private int trackNumber;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;
    public Song(String title, int length, int trackNumber) {
        this.title = title;
        this.length = length;
      this.trackNumber=trackNumber;
    }


    public Song() {

    }

    public void setAlbum(AlbumModel albumModel) {
    }

    public boolean getTitle() {
        return false;
    }
}