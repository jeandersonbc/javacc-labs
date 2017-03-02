package com.github.jeandersonbc.javacclabs.main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import com.github.jeandersonbc.javacclabs.parser.AwesomeGrammar;

public class Driver {

	public static void main(String[] args) {
		System.out.printf("Input files: %s\n", Arrays.toString(args));
		for (String source : args) {
			try {
				AwesomeGrammar parser = new AwesomeGrammar(new BufferedInputStream(new FileInputStream(source)));
				parser.parse();
				System.out.println("Done!");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
