package com.example.android.datmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

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

        AlbumAdapter adapter = new AlbumAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        ArrayList<String> albums = new ArrayList<>();
        albums.add("Hacker Devs Mix Tape");
        albums.add("Smashing Keyboards");
        albums.add("1337 Beats to Relax To");

        listView.setAdapter(adapter);
    }
}

