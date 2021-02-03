package com.tactfactory.designpatternniveau1.adapter.tp1;

public class MP4Player implements MediaPlayer{
	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp4")) {
			System.out.println("Playing "+ audioType +" file. Name: " + fileName);
		}
	}
}
