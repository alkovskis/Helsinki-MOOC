package weekEleven;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class Greater implements Runnable {

	public static void main(String[] args) {

		Greater g = new Greater();
		SwingUtilities.invokeLater(g);

	}

	private JFrame frame;

	@Override
	public void run() {
		frame = new JFrame("Swing on");
		frame.setPreferredSize(new Dimension(400, 200));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		createComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);

	}

	private void createComponents(Container contentPane) {
		JLabel label=new JLabel("HI!");
		contentPane.add(label);
		JButton b=new JButton("click");
		contentPane.add(b,BorderLayout.EAST);

	}

	public JFrame getFrame() {
		return frame;
	}

}
