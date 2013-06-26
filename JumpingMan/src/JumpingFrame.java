import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JumpingFrame extends JFrame {
	public JumpingFrame(){
		super("Jumping Man");
		JPanel panel = new JumpingPanel(this);
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLayout(new FlowLayout());
		setVisible(true);
	}
}
