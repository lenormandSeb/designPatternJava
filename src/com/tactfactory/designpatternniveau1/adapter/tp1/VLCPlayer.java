package com.tactfactory.designpatternniveau1.adapter.tp1;

public class VLCPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			System.out.println("Playing "+ audioType +" file. Name: " + fileName);
		}
	}
}
