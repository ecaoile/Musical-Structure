package com.example.android.datmusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class SongsActivity extends AppCompatActivity {

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

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
