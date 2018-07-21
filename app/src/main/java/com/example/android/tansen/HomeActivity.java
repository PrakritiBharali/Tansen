package com.example.android.tansen;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        if (songs != null) {
            songs.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent songsIntent = new Intent(HomeActivity.this, SongsActivity.class);
                    startActivity(songsIntent);
                }
            });
        }

        TextView artists = (TextView) findViewById(R.id.artists);

        // Set a click listener on that View
        if (artists != null) {
            artists.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent artistsIntent = new Intent(HomeActivity.this, ArtistsActivity.class);
                    startActivity(artistsIntent);
                }
            });
        }

        TextView albums = (TextView) findViewById(R.id.albums);

        // Set a click listener on that View
        if (albums != null) {
            albums.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent albumIntent = new Intent(HomeActivity.this, AlbumsActivity.class);
                    startActivity(albumIntent);
                }
            });
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
