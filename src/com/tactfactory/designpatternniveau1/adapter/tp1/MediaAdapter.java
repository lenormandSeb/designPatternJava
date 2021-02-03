package com.tactfactory.designpatternniveau1.adapter.tp1;

public class MediaAdapter implements MediaPlayer {

	private String Media = "mp3";
	private AudioPlayer audioPlayer = new AudioPlayer();
	private VLCPlayer vlcPlayer = new VLCPlayer();
	private MP4Player mp4Player = new MP4Player();

	public MediaAdapter(String media) {
		Media = media;
	}

	@Override
	public void play(String audioType, String fileName) {
		switch(audioType) {
		case "vlc":
			vlcPlayer.play(audioType, fileName);
			break;
		case "mp3":
			audioPlayer.play(audioType, fileName);
			break;
		case "mp4":
			mp4Player.play(audioType, fileName);
			break;
		}
	}
}
