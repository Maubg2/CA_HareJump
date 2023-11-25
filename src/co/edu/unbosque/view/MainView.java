package co.edu.unbosque.view;

import javax.swing.JFrame;

public class MainView extends JFrame{

	private HorseJumpView hjv;
	
	public MainView() {
	
		execute();
		
		getContentPane().setLayout(null);
		setTitle("CA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

	}

	private void execute() {
		// TODO Auto-generated method stub
		hjv = new HorseJumpView();
		hjv.setBounds(0, 0, 550, 450);
		getContentPane().add(hjv);
		
	}

	public HorseJumpView getHjv() {
		return hjv;
	}

	public void setHjv(HorseJumpView hjv) {
		this.hjv = hjv;
	}
	
}