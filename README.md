# RPi Library for ws2812

This is a based on [tobyweston/unicorn-hat](https://github.com/tobyweston/unicorn-hat) and [jgarff/rpi_ws281x](https://github.com/jgarff/rpi_ws281x)

Gives low-level access to led strip ws281x


## Build



```
cd src/main/c/rpi-ws281x/
make swig_prep
make build

cd -

cd src/main/c/ws2812/lib
make swig_prep
make shared

cd -
mvn install

./test.sh
```
