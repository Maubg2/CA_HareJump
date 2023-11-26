package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

import javax.swing.JOptionPane;

public class HareJump {
	
	private int[][] prueba = new int[8][8];
	
	/**
	 * This attribute is going to store the possible jumps that the hare can do.
	 */
	private int[][] jumps;
	
	/**
	 * This attribute is the matrix that has all the cells of the board.
	 */
	private int[][] board;
	
	/**
	 * This attribute is the flag if the solution is found.
	 */
	private boolean success;
	
	private int endX, endY;
	
	private ArrayList<Cell> steps;
	/**
	 * The constructor receives the p & q parameters, that will define the movement of the hare.
	 * In this method, we start the board matrix, and set up the possible jumps based on p & q values.
	 * @param p The amount of cells that the hare can jump (Vertical or horizontal).
	 * @param q The amount of cells that the hare can jump (Vertical or horizontal).
	 * @param m The amount of columns of the matrix.
	 * @param n The amount of rows of the matrix.
	 * @param x0 The initial position in "x" axis for the hare.
	 * @param y0 The initial position in "y" axis for the hare.
	 * 
	 */
	public HareJump(int p, int q, int n, int m, int x0, int y0, int endX, int endY) {
		
		//Set the exit of the hop (Solution cell)
		this.endX = endX;
		this.endY = endY;
		
		jumps = new int[][]{{p, q}, {q, p}, {-q, p}, {-p, q}, {-p, -q}, {-q, -p}, {q, -p}, {p, -q}};
		board = new int[n][m];
		
		//Check if the initial position of the hare is in the board limits.
		if(x0 < 0 || x0 >= m || y0 < 0 || y0 >= n){
			JOptionPane.showMessageDialog(null, "La posición inicial de la liebre sobrepasa los limites del tablero");
		}
		
		//Lets initialize the board positions in 0.
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = 0;
			}
		}
		
		//Set the initial position of the hare in the board as visited
		board[0][0] = 1;
		success = false;
		
		//Start the problem solution
		success = solve(x0, y0, 1);
	}
	
	/**
	 * This method calls the hop method that will solve the problem with backtracking and then, returns the success attribute (true if a solution was found)
	 * @param x0 The initial position in "x" axis for the hare.
	 * @param y0 The initial position in "y" axis for the hare.
	 * @param pos The next hop
	 * @return success
	 */
	public boolean solve(int x0, int y0, int pos) {
		hop1(x0, y0, pos);
		return success;
	}
	
	/**
	 * This method solves the problem with backtracking, it will look all the possible jumps of the hare and choose the best one
	 * @param x The current position in "x" axis for the hare. It changes constantly because the recursion process.
	 * @param y The current position in "y" axis for the hare. It changes constantly because the recursion process.
	 * @param step The next hop (The number of the current hop)
	 */
	public void hop(int x, int y, int step) {
		
		//This is the new position on "x" axis after the jump
		int nx;
		
		//This is the new position on "y" axis after the jump
		int ny;
		
		//This is the jump possibility, so, 0 is the first possible jump in "jumps" matrix, 1 is the second possible jump.
		int k = 0;
		
		//----- OPTIMIZATION
		//This priority queue stores all the next possible steps ordered by its distance to the target point, in order to look first at the closest point.
		PriorityQueue<Cell> queue = new PriorityQueue<>(Comparator.comparingInt(a -> (a.getDistance() + heuristic(a.getX(), a.getY(), endX, endY))));
		queue.add(new Cell(x, y, heuristic(x, y, endX, endY))); //Add a new cell to the queue
		
		
		//Lets do the backtracking
		do{
			k++; //Go to the next possible jump
			
			//(k - 1) represents the next possible jump in the "jump" matrix
			nx = x + board[k-1][0]; //Here we update the new position in x, so we take the x component of the jump ([0]) in "jumps" and add it to the last x position.
			ny = y + board[k-1][0];	//Here we update the new position in y, so we take the y component of the jump ([1]) in "jumps" and add it to the last y position.
			
			//First, we check that the new position hasn't been visited yet. Then, we check that the new positions are in the matrix range.
			if(board[nx][ny] == 0 && nx >= 0 && nx < board[0].length && ny >= 0 && ny < board.length){
				
				//We make the jump
				board[nx][ny] = step;
				
				//Check if the current position is not in the solution
				
				//TODO: LLegará un punto que no haya un posible salto vacío (No hay solucion)
				//TODO: Implementar Rama Y Poda (Hallar la solución más óptima, no la primera que encuentre)
				//Heurística: (Saber una estimación de cuántos pasos faltan para llegar a la meta): |endX-nx| + |endY-ny| 
				if(nx != endX && ny != endY){
					//Check the next movement
					hop(nx, ny, step + 1);
					
					if(!success){
						board[nx][ny] = 0;
					}
					
				}else{
					//We found the solution
					success = true;
				}
				
			}
					
		}while(!success && k < 8);
		
	}


	
	public void hop1(int x, int y, int step) {
	    PriorityQueue<Cell> queue = new PriorityQueue<>(Comparator.comparingInt(a -> (a.getDistance() + heuristic(a.getX(), a.getY(), endX, endY))));
	    steps = new ArrayList<>();
	    queue.add(new Cell(x, y, heuristic(x, y, endX, endY)));

	    while (!queue.isEmpty()) { //success == false
	        Cell current = queue.poll();
	        steps.add(current);
	        x = current.getX();
	        y = current.getY();

	        System.out.println("Current position: (" + x + ", " + y + ")"); // Print current position

	        if (x == endX && y == endY) {
	            success = true;
	            return;
	        }
	        
	        for (int k = 0; k < 8; k++) {
	            int nx = x + jumps[k][0];
	            int ny = y + jumps[k][1];

	            System.out.println("Next possible position: (" + nx + ", " + ny + ")"); // Print next position

	            if (nx >= 0 && nx < board[0].length && ny >= 0 && ny < board.length && board[nx][ny] == 0) {
	                step++;
	                board[nx][ny] = step;  // Increment step and assign to board
	                System.out.println("Took a step"); //Poner if
	                queue.add(new Cell(nx, ny, heuristic(nx, ny, endX, endY) + step));
	                
	            }
	        }
	        if (!success) {
		        // If backtracking occurred and no success was found, reset the step
		        step--;
		        board[x][y] = 0;  
		    }
	    }
	    
	}



	
	public void escribirPrueba() {
		for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                System.out.print(prueba[i][j] + " ");
            }
            System.out.println();
        }
	}


	public void writeBoard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
        for(Cell c : steps) {
        	System.out.println("x: " + c.getX() + "\ny: " + c.getY() + "\n");
        }
    }
	
	/**
	 * This method calculates the classic Manhattan distance, in order to have an estimated remaining steps to reach the target point
	 * @param x The actual position in x
	 * @param y The actual position in y
	 * @param endX The target position in x
	 * @param endY The target position in y
	 * @return The Manhattan distance
	 */
	public int heuristic(int x, int y, int endX, int endY) {
		return Math.abs(endX - x) + Math.abs(endY - y); //|endX-x| + |endY-y|
	}

	public int[][] getBoard() {  
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
}
