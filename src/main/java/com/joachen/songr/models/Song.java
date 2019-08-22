package com.joachen.songr.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String title;
    int length;
    int trackNumber;
    String album;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "song")
    List<Album> albums;

    public Song(String song) {
        String[] songs = song.split(" ");
        this.title = songs[0];
    }

    public Song() {}

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum () {
        return album;
    }
}
