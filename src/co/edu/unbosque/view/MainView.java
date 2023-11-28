package co.edu.unbosque.view;

import javax.swing.JFrame;

public class MainView extends JFrame{

	private HareJumpView hj;
	private ShowData sd;
	
	public MainView() {
	
		execute();
		
		getContentPane().setLayout(null);
		setTitle("CA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200, 700);
		setLocationRelativeTo(null);
	//	setResizable(false);
		setVisible(true);

	}

	private void execute() {
		// TODO Auto-generated method stub
		hj = new HareJumpView();
		hj.setBounds(0, 0, 500, 700);
		getContentPane().add(hj);
		
		sd = new ShowData();
		sd.setBounds(500, 0, 700, 700);
		getContentPane().add(sd);
	}
	

	public HareJumpView getHj() {
		return hj;
	}

	public void setHj(HareJumpView hjv) {
		this.hj = hjv;
	}

	public ShowData getSd() {
		return sd;
	}

	public void setSd(ShowData sd) {
		this.sd = sd;
	}

}