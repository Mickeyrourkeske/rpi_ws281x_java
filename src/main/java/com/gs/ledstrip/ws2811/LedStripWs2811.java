package com.gs.ledstrip.ws2811;

import com.gs.ledstrip.LedStrip;

public class LedStripWs2811 implements LedStrip {

	private final int numPixels;
	
	private final ws2811_t ledstring = new ws2811_t();
	private final ws2811_channel_t channel;
	
	/**
	 * @param count number of LED pixels
	 * @param pin GPIO pin connected to the pixels (must support PWM!)
	 * @param freqHz LED signal frequency in hertz (usually 800000hz)
	 * @param dma  DMA channel to use for generating signal (try 5)
	 * @param invert true to invert the signal (when using NPN transistor level shift)
	 * @param brightness Set to 0 for darkest and 255 for brightest
	 * @param channel the PWM channel to use
	 */
	public LedStripWs2811(int count, int pin, int freqHz, int dma, int brightness) {
		this.numPixels = count;
		
		ledstring.setFreq(freqHz);
		ledstring.setDmanum(dma);
		
		ws2811_channel_t channel0 = rpi_ws281x.ws2811_channel_get(ledstring, 0);
		channel0.setGpionum(pin);
		channel0.setCount(count);
		channel0.setInvert(0);
		channel0.setBrightness(brightness);
		
		ws2811_channel_t channel1 = rpi_ws281x.ws2811_channel_get(ledstring, 1);
		channel1.setGpionum(pin);
		channel1.setCount(count);
		channel1.setInvert(0);
		channel1.setBrightness(brightness);
		
		channel = channel0;
		
		int result = rpi_ws281x.ws2811_init(ledstring);
		if (result != 0) {
			throw new RuntimeException("ws2811_init failed with code " + result);
		}
	}

	@Override
	public void setPixelColor(int pixel, short r, short g, short b) {
		long colour = (r << 16) | (g << 8) | b;
		rpi_ws281x.ws2811_led_set(channel, pixel, colour);
		
	}

	@Override
	public void setAllPixelColors(short r, short g, short b) {
		for (int i = 0; i < numPixels; i++) {
			setPixelColor(i, r, g, b);
		}
	}

	@Override
	public void setBrightness(double brightness) {
		channel.setBrightness((int) (brightness * 255.0));
	}

	@Override
	public double getBrightness() {
		return channel.getBrightness();
	}

	@Override
	public int getNumberPixels() {
		return channel.getCount();
	}

	@Override
	public void show() {
		int result = rpi_ws281x.ws2811_render(ledstring);
		if (result != 0) {
			throw new RuntimeException("ws2811_render failed with code " + result);
		}
	}

	@Override
	public void clear() {
		setAllPixelColors((short) 0, (short) 0, (short) 0);
		show();
	}

	@Override
	public void shutdown() {
		rpi_ws281x.ws2811_fini(ledstring);
		ledstring.delete();
	}

}
