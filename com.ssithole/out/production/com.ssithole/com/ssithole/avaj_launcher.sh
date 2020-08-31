#!/usr/bin/env bash
javac Main.java ./Aircraft/*.java ./Weather/*.java ./WriteLog/*.java
#java com.simulator.Simulator scenario.txt
java Main senario.txt ./Aircraft/*.class ./Weather/*.class ./WriteLog/*.class
echo "removing generated classes . . ."
rm -rf  *.class ./Aircraft/*.class ./Weather/*.class ./WriteLog/*.class
echo "\nDone!"
#open simulation.txt
