package com.example.android.tansen;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();
    /**
     * Custom constructor
     * @param context The current context. Used to inflate layout file.
     * @param songs The list of objects to display in a list.
     */
    public SongAdapter(Activity context, ArrayList<Song> songs){
        super(context, 0, songs);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView upperText = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        upperText.setText(currentSong.getSongName());

        TextView lowerText = (TextView) listItemView.findViewById(R.id.default_text_view);
        lowerText.setText(currentSong.getArtistsName());

        return listItemView;
    }
}
