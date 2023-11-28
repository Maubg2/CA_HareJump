package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HareJumpView extends JPanel{
	
//	private JTextArea out;
	
	private JLabel title;
	
	private JLabel labP;
	private JLabel labQ;
	private JTextField inpP;
	private JTextField inpQ;
	
	private JLabel labN;
	private JLabel labM;
	private JTextField inpN;
	private JTextField inpM;
	
	private JLabel labX0;
	private JLabel labY0;
	private JTextField inpX0;
	private JTextField inpY0;
	
	private JLabel labEndX;
	private JLabel labEndY;
	private JTextField inpEndX;
	private JTextField inpEndY;

	private JButton execute;
	private JButton exit;
	
	public HareJumpView() {
		
		setLayout(null);
		setBackground(Color.GRAY);
		execute();
		setVisible(true);
		
	}

	private void execute() {
		
		title = new JLabel("Hare Jump");
		title.setFont(new Font("Cooper black", Font.BOLD, 20));
		title.setForeground(Color.BLACK);
		title.setBounds(180, 30, 300, 30);
		add(title);
		
		
		labP = new JLabel("Value of p: ");
		labP.setFont(new Font("Arial", Font.ITALIC, 15));
		labP.setForeground(Color.BLACK);
		labP.setBounds(60, 120, 140, 30);
		add(labP);
		
		inpP = new JTextField("");
		inpP.setBounds(150, 120, 50, 25);
		add(inpP);
		
		labQ = new JLabel("Value of q: ");
		labQ.setFont(new Font("Arial", Font.ITALIC, 15));
		labQ.setForeground(Color.BLACK);
		labQ.setBounds(240, 120, 140, 30);
		add(labQ);
		
		inpQ = new JTextField("");
		inpQ.setBounds(320, 120, 50, 25);
		add(inpQ);
		
		
		labN = new JLabel("Value of n: ");
		labN.setFont(new Font("Arial", Font.ITALIC, 15));
		labN.setForeground(Color.BLACK);
		labN.setBounds(60, 220, 140, 30);
		add(labN);
		
		inpN = new JTextField("");
		inpN.setBounds(150, 220, 50, 25);
		add(inpN);
		
		labM = new JLabel("Value of m: ");
		labM.setFont(new Font("Arial", Font.ITALIC, 15));
		labM.setForeground(Color.BLACK);
		labM.setBounds(240, 220, 140, 30);
		add(labM);
		
		inpM = new JTextField("");
		inpM.setBounds(320, 220, 50, 25);
		add(inpM);
		
		labX0 = new JLabel("Start of X: ");
		labX0.setFont(new Font("Arial", Font.ITALIC, 15));
		labX0.setForeground(Color.BLACK);
		labX0.setBounds(70, 340, 140, 30);
		add(labX0);
		
		inpX0 = new JTextField("");
		inpX0.setBounds(150, 340, 50, 25);
		add(inpX0);
		
		labY0 = new JLabel("Start of Y: ");
		labY0.setFont(new Font("Arial", Font.ITALIC, 15));
		labY0.setForeground(Color.BLACK);
		labY0.setBounds(240, 340, 140, 30);
		add(labY0);
		
		inpY0 = new JTextField("");
		inpY0.setBounds(320, 340, 50, 25);
		add(inpY0);
		
		
		labEndX = new JLabel("End of X: ");
		labEndX.setFont(new Font("Arial", Font.ITALIC, 15));
		labEndX.setForeground(Color.BLACK);
		labEndX.setBounds(70, 460, 140, 30);
		add(labEndX);
		
		inpEndX = new JTextField("");
		inpEndX.setBounds(150, 460, 50, 25);
		add(inpEndX);
		
		labEndY = new JLabel("End of Y: ");
		labEndY.setFont(new Font("Arial", Font.ITALIC, 15));
		labEndY.setForeground(Color.BLACK);
		labEndY.setBounds(240, 460, 140, 30);
		add(labEndY);
		
		inpEndY = new JTextField("");
		inpEndY.setBounds(320, 460, 50, 25);
		add(inpEndY);
		
		
		
		
		execute = new JButton("Run");
		execute.setBackground(Color.BLACK);
		execute.setForeground(Color.WHITE);
		execute.setBounds(312, 580, 70, 30);
		add(execute);
		
		exit = new JButton("Exit");
		exit.setBackground(Color.BLACK);
		exit.setForeground(Color.WHITE);
		exit.setBounds(142, 580, 70, 30);
		add(exit);
		
	}

	public JTextField getInpP() {
		return inpP;
	}

	public void setInpP(JTextField inpP) {
		this.inpP = inpP;
	}

	public JTextField getInpQ() {
		return inpQ;
	}

	public void setInpQ(JTextField inpQ) {
		this.inpQ = inpQ;
	}

	public JTextField getInpN() {
		return inpN;
	}

	public void setInpN(JTextField inpN) {
		this.inpN = inpN;
	}

	public JTextField getInpM() {
		return inpM;
	}

	public void setInpM(JTextField inpM) {
		this.inpM = inpM;
	}

	public JTextField getInpX0() {
		return inpX0;
	}

	public void setInpX0(JTextField inpX0) {
		this.inpX0 = inpX0;
	}

	public JTextField getInpY0() {
		return inpY0;
	}

	public void setInpY0(JTextField inpY0) {
		this.inpY0 = inpY0;
	}

	public JTextField getInpEndX() {
		return inpEndX;
	}

	public void setInpEndX(JTextField inpEndX) {
		this.inpEndX = inpEndX;
	}

	public JTextField getInpEndY() {
		return inpEndY;
	}

	public void setInpEndY(JTextField inpEndY) {
		this.inpEndY = inpEndY;
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