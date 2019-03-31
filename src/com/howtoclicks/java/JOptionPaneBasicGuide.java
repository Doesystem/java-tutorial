package com.howtoclicks.java;

import javax.swing.JOptionPane;

public class JOptionPaneBasicGuide {
	public static void main(String[] args) {
//		JFrame jframe = new JFrame();
//		int selectOption = JOptionPane.showConfirmDialog(jframe, "show confirm dialog");
//		if(selectOption == 0) {
//			System.out.println("Yes");
//			// ...
//		}
//		else if(selectOption == 1) {
//			System.out.println("No");
//			// ...
//		}
//		else {
//			System.out.println("Cancel");
//			// ..
//		}
		
		String name = JOptionPane.showInputDialog("Name: ");
		System.out.println("Hello " + name);
	}
}
