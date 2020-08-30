#!/usr/bin/env bash
javac Main.java ./Aircraft/*.java ./Weather/*.java ./WriteLog/*.java
#java com.simulator.Simulator scenario.txt
java Main
echo "removing generated classes . . ."
rm -rf ./Aircraft/*.class ./Weather/*.class ./WriteLog/*.class
echo "\nDone!"
#open simulation.txt
