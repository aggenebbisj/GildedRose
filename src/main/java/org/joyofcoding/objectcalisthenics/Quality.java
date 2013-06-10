package org.joyofcoding.objectcalisthenics;

public class Quality {

	private int quality;

	public Quality(int quality) {
		this.quality = quality;
	}
	
	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	void decrease() {
		if (getQuality() > 0) {
			setQuality(getQuality() - 1);
		}
	}

	protected void increase() {
		if (getQuality() < 50) {
			setQuality(getQuality() + 1);
		}
	}
	
}