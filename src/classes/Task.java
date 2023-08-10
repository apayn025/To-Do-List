package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel {
	
	private JLabel tab;
	private JTextField taskName;
	private JButton done;
	private boolean checked;
	//Constructor
	Task() {
		this.setPreferredSize(new Dimension(400, 20));
		this.setBackground(Color.LIGHT_GRAY);
		
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		tab = new JLabel("");
		tab.setPreferredSize(new Dimension(20,20));
		tab.setHorizontalAlignment(JLabel.CENTER);
		this.add(tab, BorderLayout.WEST);
		
		taskName = new JTextField("Type task here");
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setBackground(Color.LIGHT_GRAY);
		
		this.add(taskName, BorderLayout.CENTER);
		
		done = new JButton("Done");
		done.setPreferredSize(new Dimension(40,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		
		this.add(done, BorderLayout.EAST);
		
	}
	
	public JButton getDone() {
		return done;
	}
	
	public boolean getState() {
		return checked;
	}
	
	public void changeState() {
		this.setBackground(new Color(115, 201, 119));
		taskName.setBackground(new Color(115, 201, 119));
		checked = true;
		revalidate();
	}
}
