package net.bluepoet.lambda;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerTest {
	public static void main(String[] args) {
		JButton button = new JButton("Test Button");
		// button.addActionListener(new ActionListener() {
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// System.out.println("Click");
		// }
		// });

		button.addActionListener(e -> System.out.println("click!"));

		JFrame frame = new JFrame("ListenerTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}
