package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HorseJumpView extends JPanel{
	
	private JLabel title;
	private JLabel labInpN;
	private JTextField inpN;
	private JLabel labInpX;
	private JLabel labInpY;
	private JTextField inpX;
	private JTextField inpY;
	private JTextArea out;
	private JButton execute;
	private JButton exit;
	
	public HorseJumpView() {
		
		setLayout(null);
		setBackground(Color.GRAY);
		execute();
		setVisible(true);
		
	}

	private void execute() {
		// TODO Auto-generated method stub
		
		title = new JLabel("Horse Jump");
		title.setFont(new Font("Cooper black", Font.BOLD, 20));
		title.setForeground(Color.BLACK);
		title.setBounds(180, 30, 300, 30);
		add(title);
		
		labInpN = new JLabel("Enter the value of n: ");
		labInpN.setFont(new Font("Arial", Font.ITALIC, 15));
		labInpN.setForeground(Color.BLACK);
		labInpN.setBounds(120, 100, 300, 30);
		add(labInpN);
		
		inpN = new JTextField("");
		inpN.setBounds(300, 100, 50, 25);
		add(inpN);
		
		labInpX = new JLabel("Enter the starting position (X): ");
		labInpX.setFont(new Font("Arial", Font.ITALIC, 15));
		labInpX.setForeground(Color.BLACK);
		labInpX.setBounds(70, 140, 300, 30);
		add(labInpX);
		
		labInpY = new JLabel("Enter the starting position (Y): ");
		labInpY.setFont(new Font("Arial", Font.ITALIC, 15));
		labInpY.setForeground(Color.BLACK);
		labInpY.setBounds(70, 190, 300, 30);
		add(labInpY);
		
		inpX = new JTextField("");
		inpX.setBounds(300, 140, 50, 25);
		add(inpX);
		
		inpY = new JTextField("");
		inpY.setBounds(300, 190, 50, 25);
		add(inpY);
		
		out = new JTextArea("");
		out.setBounds(150, 240, 200, 100);
		out.setEditable(false);
		add(out);
		
		execute = new JButton("Run");
		execute.setBackground(Color.BLACK);
		execute.setForeground(Color.WHITE);
		execute.setBounds(380, 100, 70, 30);
		add(execute);
		
		exit = new JButton("Exit");
		exit.setBackground(Color.BLACK);
		exit.setForeground(Color.WHITE);
		exit.setBounds(380, 300, 70, 30);
		add(exit);
		
	}

	public JTextField getInpN() {
		return inpN;
	}
	
	public JTextField getInpX() {
		return inpX;
	}

	public void setInpX(JTextField inpX) {
		this.inpX = inpX;
	}

	public JTextField getInpY() {
		return inpY;
	}

	public void setInpY(JTextField inpY) {
		this.inpY = inpY;
	}

	public void setInpN(JTextField inpN) {
		this.inpN = inpN;
	}

	public JTextArea getOut() {
		return out;
	}

	public void setOut(JTextArea out) {
		this.out = out;
	}

	public JButton getExecute() {
		return execute;
	}

	public void setExecute(JButton execute) {
		this.execute = execute;
	}

	public JButton getExit() {
		return exit;
	}

	public void setExit(JButton exit) {
		this.exit = exit;
	}

}