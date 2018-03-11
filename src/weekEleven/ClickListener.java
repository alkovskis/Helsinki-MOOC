package weekEleven;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ClickListener implements ActionListener {

	Calculator calc;
	JLabel label;

	public ClickListener(Calculator calc, JLabel label) {
		this.calc = calc;
		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.calc.increase();
		this.label.setText("this.calc.giveValue()");

	}

}
