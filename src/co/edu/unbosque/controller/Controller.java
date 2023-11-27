package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.HareJumpRYP;
import co.edu.unbosque.model.HorseJump;
import co.edu.unbosque.view.MainView;

public class Controller implements ActionListener{
    
    // Definición de variables miembro
    
    private MainView mv;
    private HorseJump hp;
    private HareJumpRYP ryp;

    // Constructor de la clase
    public Controller() {
        mv = new MainView();
        setListeners();
    	execute();
    }
    
    public void execute() {
    	//HareJump jumper = new HareJump(2, 1, 5, 5, 0, 0, 2, 2);
    	
    	//Condiciones del ejercicio
    	int p = 2, q = 1; // Valores de los movimientos del caballo
        int n = 10, m = 10; // Dimensiones del tablero
        int x0 = 0, y0 = 0; // Posición inicial del caballo
        int endX = 8, endY = 7; // Posición objetivo
        
        ryp = new HareJumpRYP(p, q, n, m, x0, y0, endX, endY);
        
    	//jumper.printBoard();
    }
    
    public void setListeners() {
    	mv.getHj().getExecute().addActionListener(this);
    	mv.getHj().getExit().addActionListener(this);
    }
    
    @Override
	public void actionPerformed(ActionEvent e) {
    	switch (e.getActionCommand()) {
    	case "Run":
    		
    		mv.getHj().setVisible(false);
    		mv.getWt().setVisible(true);
    		
    		try {
    			
    			int p = Integer.parseInt(mv.getHj().getInpP().getText());
    			int q = Integer.parseInt(mv.getHj().getInpQ().getText());
    			int n = Integer.parseInt(mv.getHj().getInpN().getText());
    			int m = Integer.parseInt(mv.getHj().getInpM().getText());
    			int x0 = Integer.parseInt(mv.getHj().getInpX0().getText());
    			int y0 = Integer.parseInt(mv.getHj().getInpY0().getText());
    			int endX = Integer.parseInt(mv.getHj().getInpEndX().getText());
    			int endY = Integer.parseInt(mv.getHj().getInpEndY().getText());
        		
    	    	ryp = new HareJumpRYP(p, q, n, m, x0, y0, endX, endY);
    	    	
    	    	Integer[][] table = ryp.getBoard();
    	    	String[] columnNames =  {"a", "b", "c", "d", "e"};
    	    	
    	    	mv.getWt().actualizarTabla(table, columnNames);
    	    	
    			
    		}catch(NumberFormatException ee) {
    			mv.getHj().setVisible(true);
        		mv.getWt().setVisible(false);
    			JOptionPane.showMessageDialog(null, "Insert a number");
    		}
    		
    		break;
    	case "Exit":
    		System.exit(0);
    		break;
    	}
    	
	} 

    // Método para iniciar la aplicación
 /*   public void startup() {
        int x, y;
        boolean solucion;
        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            System.out.println("Posicion inicial del caballo. ");
            System.out.print(" x = ");
            x = Integer.parseInt(entrada.readLine());
            System.out.print(" y = ");
            y = Integer.parseInt(entrada.readLine());
            
            // Crea una instancia de HorseJump con la posición inicial ingresada
            HorseJump horse = new HorseJump(x, y);
            
            // Intenta resolver el problema del salto del caballo
            solucion = horse.solve();
            
            // Si hay solución, imprime el tablero resultante
            if (solucion) {
                horse.writeBoard();
            }
        } catch (Exception m) {
            System.out.println("No se pudo probar el algoritmo, " + m);
        }
    }*/

}
