package com.example.android.datmusicapp;

public class Song {
    private String mTitle;
    private String mAlbum;
    private String mArtist;
    private String mGenre;
    private int mDuration;
    private int mYear;

    public Song(String title, String album, String artist, String genre, int duration, int year)
    {
        mTitle = title;
        mAlbum = album;
        mArtist = artist;
        mGenre = genre;
        mDuration = duration;
        mYear = year;
    }

    public String getSongTitle()
    {
        return mTitle;
    }

    public String getSongArtist()
    {
        return mArtist;
    }

    public String getSongAlbum()
    {
        return mAlbum;
    }

    public String getSongDuration()
    {
        return mDuration + " seconds";
    }
}
