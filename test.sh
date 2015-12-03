#!/bin/sh

sudo java -Djava.library.path="src/main/c/rpi-ws281x/" -cp target/rpi_ws281x_java-1.0.jar com.gs.ledstrip.sample.Main

