# RPi Library for ws2812

This is a based on [tobyweston/unicorn-hat](https://github.com/tobyweston/unicorn-hat)

Gives low-level access to led strip ws281x


## Build



```
cd src/main/c/rpi-ws281x/lib
scons
cd -

cd src/main/c/rpi-ws281x/
make swig_prep
make build

cd -

cd src/main/c/ws2812/lib
make swig_prep
make shared

cd -
mvn install
cp target/rpi_ws2812_java-1.0.jar .
```
