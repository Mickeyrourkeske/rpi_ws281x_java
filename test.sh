#!/bin/sh

sudo java -Djava.library.path="src/main/c/ws2812/" -cp rpi_ws2812_java-1.0.jar com.gs.ledstrip.sample.Main
