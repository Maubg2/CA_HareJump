package co.edu.unbosque.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import co.edu.unbosque.model.HareJump;
import co.edu.unbosque.model.HareJumpRYP;
import co.edu.unbosque.model.HorseJump;
import co.edu.unbosque.view.HorseJumpView;
import co.edu.unbosque.view.MainView;

public class Controller {
    
    // Definición de variables miembro
    
    //private MainView mv;
    private HorseJump hp;
    private HareJumpRYP ryp;

    // Constructor de la clase
    public Controller() {
        //mv = new MainView();
    	execute();
    }
    
    public void execute() {
    	//HareJump jumper = new HareJump(2, 1, 5, 5, 0, 0, 2, 2);
    	
    	//Condiciones del ejercicio
    	int p = 2, q = 1; // Valores de los movimientos del caballo
        int n = 4, m = 4; // Dimensiones del tablero
        int x0 = 0, y0 = 0; // Posición inicial del caballo
        int endX = 2, endY = 3; // Posición objetivo

        ryp = new HareJumpRYP(p, q, n, m, x0, y0, endX, endY);
    	
    	//jumper.printBoard();
    }

    // Método para iniciar la aplicación
    public void startup() {
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
    } 
}
