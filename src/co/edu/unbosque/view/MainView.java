package co.edu.unbosque.view;

import javax.swing.JFrame;

public class MainView extends JFrame{

	private HareJumpView hj;
	private WriteTable wt;
	
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
		hj = new HareJumpView();
		hj.setBounds(0, 0, 550, 450);
		getContentPane().add(hj);
		
		wt = new WriteTable();
		wt.setBounds(0, 0, 500, 400);
		getContentPane().add(wt);
	}
	

	public HareJumpView getHj() {
		return hj;
	}

	public void setHj(HareJumpView hjv) {
		this.hj = hjv;
	}

	public WriteTable getWt() {
		return wt;
	}

	public void setWt(WriteTable wt) {
		this.wt = wt;
	}
	
}