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
		title.setBounds(180, 40, 300, 30);
		add(title);
		
		labInpN = new JLabel("Enter the value of n: ");
		labInpN.setFont(new Font("Arial", Font.ITALIC, 15));
		labInpN.setForeground(Color.BLACK);
		labInpN.setBounds(120, 100, 300, 30);
		add(labInpN);
		
		inpN = new JTextField("");
		inpN.setBounds(300, 100, 50, 30);
		add(inpN);
		
		out = new JTextArea("");
		out.setBounds(150, 180, 200, 150);
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