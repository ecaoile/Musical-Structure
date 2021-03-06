package com.example.android.datmusicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

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

        ArrayList<String> artists = new ArrayList<>();
        artists.add("Dem Coders");
        artists.add("Rage Against Exceptions");
        artists.add("Smooth Coder");

        ArtistAdapter adapter = new ArtistAdapter(this, artists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
