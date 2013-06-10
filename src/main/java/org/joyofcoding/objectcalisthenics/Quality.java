package org.joyofcoding.objectcalisthenics;

public class Quality {

	private static final int MIN_QUALITY = 0;
	private static final int MAX_QUALITY = 50;
	
	private int quality;

	public Quality(int quality) {
		this.quality = quality;
	}
	
	public int getQuality() {
		return quality;
	}

	public void decrease() {
		if (getQuality() > MIN_QUALITY) {
			quality--;
		}
	}

	public void increase() {
		if (getQuality() < MAX_QUALITY) {
			quality++;
		}
	}

	public void dropToZero() {
		quality = 0;
	}
	
}