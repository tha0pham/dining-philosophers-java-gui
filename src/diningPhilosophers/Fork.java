/**
 * This class represents a fork used in the dining philosopher problem.
 */
package diningPhilosophers;

import javax.swing.JLabel;

/**
 * @author thao.pham Jun 15, 2020
 */
public class Fork {
	private int id;
	private JLabel label;

	public Fork(int id) {
		this.id = id;
		this.label = new JLabel();
	}

	public String toString() {
		return "Fork " + id;

	}

	public JLabel getLabel() {
		label.setText(toString());
		return label;
	}
}
