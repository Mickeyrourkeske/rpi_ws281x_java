package com.gs.ledstrip.ws2812;

import com.gs.ledstrip.LedStrip;

public class LedStripWs2812 implements LedStrip {

	private int numPixels;
	
	public LedStripWs2812(int numPixels) {
		this.numPixels = numPixels;
		ws2812.init(numPixels);
	}

	
	@Override
	public void setPixelColor(long pixel, short r, short g, short b) {
		ws2812.setPixelColor(pixel, r, g, b);
	}
	
	@Override
	public void setAllPixelColors(short r, short g, short b) {
		for(int i = 0; i < numPixels; i++) {
			ws2812.setPixelColor(i, r, g, b);
		}
	}

	@Override
	public void setBrightness(double brightness) {
		if (brightness < 0 || brightness > 1)
			throw new IllegalArgumentException("Brightness should be between 0.0 and 1.0");
		ws2812.setBrightness(brightness);
	}

	@Override
	public double getBrightness() {
		return ws2812.getBrightness();
	}

	@Override
	public int getNumberPixels() {
		return numPixels;
	}
	
    @Override
    public void show() {
        ws2812.show();
    }

	@Override
	public void clear() {
		ws2812.clear();
		for(int i = 0; i < numPixels; i++) {
			ws2812.setPixelColor(i, (short) 0, (short) 0, (short) 0);
		}
		show();
	}

	@Override
	public void shutdown() {
		clear();
		ws2812.terminate(0);
	}
}
