package AverageWithClass;

import java.io.*;
import java.util.*;

public class Average {
File input, output;
List<String> lines = new ArrayList();
List<Double> currLine = new ArrayList();

public Average(File in, File out) {
	this.input = in;
	this.output = out;
}
public Average() {
	
}



public File getInput() {
	return input;
}
public void setInput(File input) {
	this.input = input;
}
public File getOutput() {
	return output;
}
public void setOutput(File output) {
	this.output = output;
}


}
