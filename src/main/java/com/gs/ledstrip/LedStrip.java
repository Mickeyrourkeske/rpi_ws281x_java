package com.gs.ledstrip;

public interface LedStrip {

    void setPixelColor(long pixel, short r, short g, short b);
    
    void setAllPixelColors(short r, short g, short b);

	void setBrightness(double brightness);

	double getBrightness();
	
	int getNumberPixels();

    void show();

	void clear();

	void shutdown();
}
