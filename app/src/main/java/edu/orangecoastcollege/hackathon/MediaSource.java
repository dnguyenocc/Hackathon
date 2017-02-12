package edu.orangecoastcollege.hackathon;

import android.content.Context;
import android.media.MediaPlayer;

import java.util.ArrayList;

/**
 * Created by duyng on 2/11/2017.
 */

public class MediaSource {
    private Context context;
    static int softId[] = {};
    static int mediumSoftId[] = {};
    static int mediumId[] = {};
    static int mediumLoud[] = {};
    static int loudId[] = {};

    private ArrayList<MediaPlayer>  softMediaPlayer;
    private ArrayList<MediaPlayer>  mediumSoftMediaPlayer;
    private ArrayList<MediaPlayer>  mediumMediaPlayer;
    private ArrayList<MediaPlayer>  mediumLoudMediaPlayer;
    private ArrayList<MediaPlayer>  LoudMediaPlayer;

    public void MediaSoure(Context context){
        softMediaPlayer = new ArrayList<MediaPlayer> ();
        softMediaPlayer = new ArrayList<MediaPlayer> ();
        softMediaPlayer = new ArrayList<MediaPlayer> ();
        softMediaPlayer = new ArrayList<MediaPlayer> ();
        softMediaPlayer = new ArrayList<MediaPlayer> ();
        this.context = context;

    }
}
