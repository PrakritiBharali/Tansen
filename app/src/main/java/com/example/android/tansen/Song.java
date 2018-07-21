package com.example.android.tansen;
/**
 * {@link Song} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Song {
    private String artistsName;
    private String songName;

    /**
     * Create a new word object
     * @param lowerText is the text which will come at the lower part of the list word.
     *@param upperText is the text which will come at the upper part of the list word.
     *
     */
    public Song(String lowerText, String upperText){
        artistsName = lowerText;
        songName = upperText;
    }

    /**
     * Get lower part of the word
     * @return the lower part
     */
    public String getArtistsName() {
        return artistsName;
    }

    /**
     * Get the upper part of the word
     * @return upper part
     */
    public  String getSongName(){
        return songName;
    }
}
