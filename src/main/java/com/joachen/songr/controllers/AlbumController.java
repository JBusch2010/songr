package com.joachen.songr.controllers;

import com.joachen.songr.models.Album;
import com.joachen.songr.models.AlbumRepository;
import com.joachen.songr.models.Song;
import com.joachen.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model a) {
        List<Album> albums = albumRepository.findAll();
        a.addAttribute("albums", albums);
        return "allAlbums";
    }

    @PostMapping("/albums")
    public RedirectView addAlbums(String title, String artist, int songCount, int length, String imageURL) {
        Album a = new Album(title, artist, songCount, length, imageURL);
        albumRepository.save(a);
        return new RedirectView("/albums");
    }
}
