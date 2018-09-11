package com.example.android.datmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playing_song);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("I like Java", "Hacker Devs Mix Tape",
                "Dem Coders", "Hip Hop", 180, 2018));
        songs.add(new Song("Livin' without LINQ", "Hacker Devs Mix Tape",
                "Dem Coders", "Hip Hop", 200, 2018));
        songs.add(new Song("Off By One", "Hacker Devs Mix Tape",
                "Dem Coders", "Hip Hop", 123, 2018));
        songs.add(new Song("Forgot a Semicolon", "Smashing Keyboards",
                "Rage Against Exceptions", "rock", 222, 2017));
        songs.add(new Song("Null References All Over", "Smashing Keyboards",
                "Rage Against Exceptions", "rock", 333, 2017));
        songs.add(new Song("Steady WPM", "1337 Beats to Relax To","Smooth Coder"
                ,"instrumental",321,2016));

        // picks a random song from the ArrayList
        Song randomSong = songs.get(new Random().nextInt(songs.size()));

        TextView songTitleView = (TextView) findViewById(R.id.song_text_view);
        songTitleView.setText(randomSong.getSongTitle());

        TextView songAlbumView = (TextView) findViewById(R.id.album_text_view);
        songAlbumView.setText(randomSong.getSongAlbum());

        TextView songArtistView = (TextView) findViewById(R.id.artist_text_view);
        songArtistView.setText(randomSong.getSongArtist());

        TextView songDurationView = (TextView) findViewById(R.id.duration_text_view);
        songDurationView.setText(randomSong.getSongDuration());
    }
}
