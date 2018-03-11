package weekEleven;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import java.awt.Container;
import java.awt.Dimension;

public class Survey implements Runnable {

	private JFrame frame;

	private void createComponents(Container container) {
		BoxLayout boxLayout = new BoxLayout(container, BoxLayout.Y_AXIS);
		container.setLayout(boxLayout);
		container.add(new JLabel("Are you?"));
		JCheckBox yes = new JCheckBox("Yes");
		JCheckBox no = new JCheckBox("No");
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(yes);
		buttonGroup.add(no);
		container.add(yes);
		container.add(no);

		container.add(new JLabel("Why?"));
		JRadioButton first = new JRadioButton("No reason.");
		JRadioButton seccond = new JRadioButton("Because it is fun!");
		buttonGroup.add(first);
		buttonGroup.add(seccond);
		container.add(first);
		container.add(seccond);
	}

	@Override
	public void run() {
		frame = new JFrame("Survey");
		frame.setPreferredSize(new Dimension(200, 300));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		createComponents(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}

	public JFrame getFrame() {
		return frame;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Survey());
	}

}
