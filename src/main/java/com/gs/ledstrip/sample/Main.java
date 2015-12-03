package com.gs.ledstrip.sample;

import java.util.Random;

import com.gs.ledstrip.LedStrip;
import com.gs.ledstrip.ws2811.LedStripWs2811;

public class Main {

	volatile static boolean endless = true;

	public static void main(String[] args) throws Exception {
		LedStrip strip = new LedStripWs2811(15, 18, 800000, 5, 255);
		strip.clear();
		strip.show();

		strip.setAllPixelColors((short) 255, (short) 0, (short) 0);
		strip.show();
		strip.show();
		Thread.sleep(2000);

		strip.setAllPixelColors((short) 0, (short) 255, (short) 0);
		strip.show();
		strip.show();
		Thread.sleep(2000);

		strip.setAllPixelColors((short) 0, (short) 0, (short) 255);
		strip.show();
		strip.show();
		Thread.sleep(2000);

		Random random = new Random();

		for (int i = 0; i < strip.getNumberPixels(); i++) {

			for (int j = 0; j < strip.getNumberPixels(); j++) {
				if (i != j) {
					strip.setPixelColor(j, (short) random.nextInt(256), (short) random.nextInt(256),
							(short) random.nextInt(256));
				} else {
					strip.setPixelColor(i, (short) 0, (short) 0, (short) 0);
				}
			}
			strip.show();

			Thread.sleep(500);
		}
		
		strip.shutdown();

	}
}
