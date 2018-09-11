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

        ArrayList<String> albums = new ArrayList<>();
        albums.add("Hacker Devs Mix Tape");
        albums.add("Smashing Keyboards");
        albums.add("1337 Beats to Relax To");

        AlbumAdapter adapter = new AlbumAdapter(this,albums);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

