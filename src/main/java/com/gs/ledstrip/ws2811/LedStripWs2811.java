package com.gs.ledstrip.ws2811;

import com.gs.ledstrip.LedStrip;

public class LedStripWs2811 implements LedStrip {

	private final int numPixels;
	private final Ws2811Pixel ws2811;

	public LedStripWs2811(int numPixels) {
		this.numPixels = numPixels;
		this.ws2811 = new Ws2811Pixel(numPixels, 18, 800000, 5, false, 255, 0);
	}

	@Override
	public void setPixelColor(long pixel, short r, short g, short b) {
		ws2811.setPixelColor((int) pixel, r, g, b);
	}

	@Override
	public void setAllPixelColors(short r, short g, short b) {
		for (int i = 0; i < numPixels; i++) {
			ws2811.setPixelColor(i, r, g, b);
		}
	}

	@Override
	public void setBrightness(double brightness) {
		ws2811.setBrightness(brightness);
	}

	@Override
	public double getBrightness() {
		return ws2811.getBrightness();
	}

	@Override
	public long getNumberPixels() {
		return numPixels;
	}

	@Override
	public void show() {
		ws2811.show();
	}

	@Override
	public void clear() {
		setAllPixelColors((short) 0, (short) 0, (short) 0);
		show();
	}

	@Override
	public void shutdown() {
		ws2811.cleanup();
	}

}
