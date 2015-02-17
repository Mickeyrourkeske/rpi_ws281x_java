/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package bad.robot.unicorn.neopixel;

class ws2812 {

  static {
	System.loadLibrary("ws2812-RPi");
  }

  static void init(int numPixels) {
    ws2812JNI.init(numPixels);
  }

  static void clear() {
    ws2812JNI.clear();
  }

  static void show() {
    ws2812JNI.show();
  }

  static Color_t Wheel(short WheelPos) {
    return new Color_t(ws2812JNI.Wheel(WheelPos), true);
  }

  static void colorWipe(Color_t c, short wait) {
    ws2812JNI.colorWipe(Color_t.getCPtr(c), c, wait);
  }

  static void rainbow(short wait) {
    ws2812JNI.rainbow(wait);
  }

  static void rainbowCycle(short wait) {
    ws2812JNI.rainbowCycle(wait);
  }

  static void theaterChase(Color_t c, short wait) {
    ws2812JNI.theaterChase(Color_t.getCPtr(c), c, wait);
  }

  static void theaterChaseRainbow(short wait) {
    ws2812JNI.theaterChaseRainbow(wait);
  }

  static short setBrightness(double b) {
    return ws2812JNI.setBrightness(b);
  }

  static double getBrightness() {
    return ws2812JNI.getBrightness();
  }

  static Color_t RGB2Color(short r, short g, short b) {
    return new Color_t(ws2812JNI.RGB2Color(r, g, b), true);
  }

  static Color_t Color(short r, short g, short b) {
    return new Color_t(ws2812JNI.Color(r, g, b), true);
  }

  static short setPixelColor(long pixel, short r, short g, short b) {
    return ws2812JNI.setPixelColor(pixel, r, g, b);
  }

  static short setPixelColorT(long pixel, Color_t c) {
    return ws2812JNI.setPixelColorT(pixel, Color_t.getCPtr(c), c);
  }

  static Color_t getPixelColor(long pixel) {
    return new Color_t(ws2812JNI.getPixelColor(pixel), true);
  }

  static long numPixels() {
    return ws2812JNI.numPixels();
  }

  static Color_t getPixels() {
    long cPtr = ws2812JNI.getPixels();
    return (cPtr == 0) ? null : new Color_t(cPtr, false);
  }

  static void setPWMBit(long bitPos, short bit) {
    ws2812JNI.setPWMBit(bitPos, bit);
  }

  static short getPWMBit(long bitPos) {
    return ws2812JNI.getPWMBit(bitPos);
  }

  static void dumpLEDBuffer() {
    ws2812JNI.dumpLEDBuffer();
  }

  static void dumpPWMBuffer() {
    ws2812JNI.dumpPWMBuffer();
  }

  static void dumpPWMStatus() {
    ws2812JNI.dumpPWMStatus();
  }

  static void dumpPWMControl(long word) {
    ws2812JNI.dumpPWMControl(word);
  }

  static void dumpPWMDMAC() {
    ws2812JNI.dumpPWMDMAC();
  }

  static void dumpPWM() {
    ws2812JNI.dumpPWM();
  }

  static void dumpDMARegs() {
    ws2812JNI.dumpDMARegs();
  }

  static void dumpControlBlock(SWIGTYPE_p_dma_cb_t c) {
    ws2812JNI.dumpControlBlock(SWIGTYPE_p_dma_cb_t.getCPtr(c));
  }

  static void dumpTransferInformation(long TI) {
    ws2812JNI.dumpTransferInformation(TI);
  }

  static void dumpDMA() {
    ws2812JNI.dumpDMA();
  }

  static void terminate(int dummy) {
    ws2812JNI.terminate(dummy);
  }

}
