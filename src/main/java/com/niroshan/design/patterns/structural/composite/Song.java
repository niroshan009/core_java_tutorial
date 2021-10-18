package com.niroshan.design.patterns.structural.composite;

public class Song implements IComponent{

    private String songName;
    private String artist;
    private float speed;



    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing "+ this.songName + " by "+ this.artist);
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;

    }

    @Override
    public String getName() {
        return this.songName;
    }

    public String getArtist() {
        return this.artist;
    }
}
