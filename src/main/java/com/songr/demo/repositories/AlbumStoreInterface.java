package com.songr.demo.repositories;

import com.songr.demo.controller.AlbumModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumStoreInterface extends JpaRepository<AlbumModel,Long> {
    void deleteById(Long id);

    AlbumModel findByTitle(String title);

}
