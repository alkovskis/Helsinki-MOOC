package weekEleven;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class NoticeBoard implements Runnable {

	private JFrame frame;

	private void createComponent(Container container) {
		GridLayout layout = new GridLayout(3, 1);
		container.setLayout(layout);

		JTextField textField = new JTextField();
		JButton copyButton = new JButton("Copy!");
		JLabel label = new JLabel();

		container.add(textField);
		container.add(copyButton);
		container.add(label);
		
		ActionEventListener a=new ActionEventListener(textField, label);
		copyButton.addActionListener(a);

	}

	@Override
	public void run() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createComponent(frame);

		frame.pack();
		frame.setSize(new Dimension(400, 200));
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new NoticeBoard());
	}

}
