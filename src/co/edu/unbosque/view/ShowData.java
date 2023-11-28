package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ShowData extends JPanel{
	
	private JTextArea area;
	
	private JButton nextStep;
	private JButton lastStep;
	
	private JScrollPane scroll;
	
	public ShowData() {
		
		setLayout(null);
		setBackground(Color.GRAY);
		execute();
		setVisible(true);
		
	}
	
	public void execute() {
		
		area = new JTextArea();
		
		scroll = new JScrollPane(area);
		scroll.setBounds(30, 40, 610, 560);
		area.setEditable(false);
		add(scroll);
	
		nextStep = new JButton("Next");
		nextStep.setBackground(Color.BLACK);
		nextStep.setForeground(Color.WHITE);
		nextStep.setBounds(420, 620, 80, 30);
		add(nextStep);
		
		lastStep = new JButton("Last");
		lastStep.setBackground(Color.BLACK);
		lastStep.setForeground(Color.WHITE);
		lastStep.setBounds(180, 620, 80, 30);
		add(lastStep);
		
	}

	public JTextArea getArea() {
		return area;
	}

	public void setArea(JTextArea area) {
		this.area = area;
	}

	public JButton getNextStep() {
		return nextStep;
	}

	public void setNextStep(JButton nextStep) {
		this.nextStep = nextStep;
	}

	public JButton getLastStep() {
		return lastStep;
	}

	public void setLastStep(JButton lastStep) {
		this.lastStep = lastStep;
	}

}
