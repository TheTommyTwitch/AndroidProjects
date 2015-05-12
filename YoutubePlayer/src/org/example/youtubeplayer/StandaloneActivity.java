package org.example.youtubeplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;


public class StandaloneActivity extends Activity implements View.OnClickListener {

	public static final String GOOGLE_API_KEY = "AIzaSyA3tp9Cn5zS7vexz_4lKs2zxGeL21XPrMk";

	public static final String YOUTUBE_VIDEO_ID = "pY6uRoWsD2Y";
	public static final String YOUTUBE_PLAYLIST_ID = "LLoBb8VNqTyUXBCjjd4nINpA";

	private Button btnPlay;
	private Button btnPlayPlaylist;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.standalone);
		
		btnPlay = (Button) findViewById(R.id.btnStart);
		btnPlayPlaylist = (Button) findViewById(R.id.btnPlaylist);
		
		btnPlay.setOnClickListener(this);
		btnPlayPlaylist.setOnClickListener(this);
		
	}
	
	public void onClick(View v) {
		Intent intent = null;
		if(v == btnPlay) {
			//PLay a single video
			intent = YouTubeStandalonePlayer.createVideoIntent(this, GOOGLE_API_KEY, YOUTUBE_VIDEO_ID);
		} else if(v == btnPlayPlaylist) {
			//PLay playlist
			intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST_ID);
		}
		
		if(intent != null) {
			startActivity(intent);
		}
	}

	
}



