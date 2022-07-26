#!/bin/bash

gcc -Wall -Werror -c -fPIC repro.c
gcc -shared -o librepro.so repro.o
jextract --source -l repro repro.h
javac --add-modules=jdk.incubator.foreign Main.java
java --add-modules=jdk.incubator.foreign --enable-native-access=ALL-UNNAMED -Djava.library.path=. Main
