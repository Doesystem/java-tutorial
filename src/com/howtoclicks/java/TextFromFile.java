package com.howtoclicks.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFromFile {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("D:\\Youtube Project\\Eclipse\\Documents\\test.txt"));
		
		while(in.hasNext()) {
			String line = in.nextLine();
			System.out.println(line);
		}
		
		in.close();
	}
}
