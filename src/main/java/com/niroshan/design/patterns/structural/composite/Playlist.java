package com.niroshan.design.patterns.structural.composite;

import java.util.ArrayList;

public class Playlist implements IComponent{

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    // my code
    @Override
    public void play() {
        System.out.println("Playing playlist "+ this.playlistName + "..........");
        this.playlist.forEach(playListItem -> {
            playListItem.play();
        });

    }

    @Override
    public void setPlaybackSpeed(float speed) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName() {
        return this.playlistName;
    }

    // Your code goes here!

    public void add(IComponent song){
        this.playlist.add(song);
    }

}
