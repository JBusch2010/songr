package com.joachen.songr.controllers;

import com.joachen.songr.models.Song;
import com.joachen.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;

    @GetMapping("/songs/{id}")
    public String getOneSong(@PathVariable long id, Model m) {
        Song s = songRepository.findById(id).get();
        System.out.println(s.getAlbum());
        m.addAttribute("song", s);
        return "oneSong";
    }

    @PostMapping("/albums/song")
    public RedirectView addSong(String title) {
        Song s = new Song(title);
        songRepository.save(s);
        return new RedirectView("/albums/song");
    }
}
