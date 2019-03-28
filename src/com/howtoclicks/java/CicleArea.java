package com.howtoclicks.java;

import java.util.Scanner;

public class CicleArea {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("intput r: ");
		int r = in.nextInt();
		
		double pi = Math.PI;
		double area = pi * (r*r);
		
		System.out.println("area: " + area);
		
		in.close();
	}
}
