package com.howtoclicks.java;

import javax.swing.JList;
import javax.swing.JOptionPane;

public class DropdownAndMultipleJOptionPane {
	public static void main(String[] args) {
		String[] list = new String[] {"A", "B", "C", "D"};
//		Object obj = JOptionPane.showInputDialog(null, "Choose..", "Choose..", JOptionPane.PLAIN_MESSAGE, null, list, list[1]);
//		System.out.println(obj);
		
		JList<String> jlist = new JList<String>(list);
		JOptionPane.showMessageDialog(null, jlist, "Choose..", JOptionPane.PLAIN_MESSAGE);
		int[] values = jlist.getSelectedIndices();
		System.out.println(values.length);
		for (int i = 0; i < values.length; i++) {
			System.out.println(list[values[i]]);
		}
	}
}
