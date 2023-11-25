package co.edu.unbosque.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import co.edu.unbosque.model.HorseJump;
import co.edu.unbosque.view.HorseJumpView;
import co.edu.unbosque.view.MainView;

public class Controller {
    
    // Definición de variables miembro
    
    //private MainView mv;
    private HorseJump hp;

    // Constructor de la clase
    public Controller() {
        //mv = new MainView();
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
