package com.pr7;

import java.awt.Button;
import java.awt.event.*;
class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
			System.out.println("ActionEvent Occurred!!!");
	}
}
public class InnerEx7 {

	public static void main(String[] args) {
		Button b = new Button("start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		}
		
		);
	}

}
