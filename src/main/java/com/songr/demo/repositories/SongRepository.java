package com.songr.demo.repositories;

import com.songr.demo.controller.Album;
import com.songr.demo.controller.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface SongRepository extends JpaRepository<Song,Long> {
    List<Song> findByAlbum(Album album);
}
