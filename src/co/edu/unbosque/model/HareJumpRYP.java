package co.edu.unbosque.model;
import java.util.*;

public class HareJumpRYP {

	private int[][] jumps;
    private Integer[][] board;
    private int endX, endY;
    private int[][] moves = {{1, 2}, {-1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, 1}, {-2, -1}};
    private ArrayList<int[]> takenSteps;

    public HareJumpRYP(int p, int q, int n, int m, int x0, int y0, int endX, int endY) {
        this.endX = endX;
        this.endY = endY;
        jumps = new int[][]{{p, q}, {q, p}, {-q, p}, {-p, q}, {-p, -q}, {-q, -p}, {q, -p}, {p, -q}};
        board = new Integer[n][m];

        if (x0 < 0 || x0 >= m || y0 < 0 || y0 >= n) {
            System.out.println("La posición inicial de la liebre sobrepasa los límites del tablero");
            return;
        }

        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], 0);
        }

        boolean success = hop(x0, y0);

        if (success) {
            System.out.println("Se encontró un camino hacia la posición final:");
            printBoard();
        } else {
            System.out.println("No se encontró un camino hacia la posición final.");
        }
    }

    private boolean hop(int x, int y) {
    	PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> (heuristic(a[0], a[1]))));
    	pq.add(new int[]{x, y});
        takenSteps = new ArrayList<>();
        int step = 1;

        while (!pq.isEmpty()) {
        	int[] current = pq.poll();
            x = current[0];
            y = current[1];
            takenSteps.add(new int[]{x, y});
            board[x][y] = step++;

            if (x == endX && y == endY) {
                return true;
            }

            boolean foundNextMove = false;
            int nextX = -1, nextY = -1;

            for (int[] move : moves) {
                int nx = x + move[0];
                int ny = y + move[1];

                if (isValidMove(nx, ny) && board[nx][ny] == 0) {
                	pq.add(new int[] {nx, ny});
                    foundNextMove = true;
                    nextX = nx;
                    nextY = ny;
                    break;
                }
            }

            if (!foundNextMove) {
                // Backtrack to previous step
                if (takenSteps.size() <= 1) {
                    return false; // No more available moves to backtrack
                }

                // Rama y poda: Verificar si hay un camino más corto desde este punto
                int[] lastStep = takenSteps.remove(takenSteps.size() - 1);
                x = lastStep[0];
                y = lastStep[1];

                if (step < board[x][y] || board[x][y] == 0) {
                	System.out.println("Retrocediendo...");
                    board[x][y] = step; // Actualizar el valor en el tablero con el número de pasos actual
                } else {
                    continue; // Evitar explorar esta rama si hay un camino más corto desde este punto
                }
            } 
        }
        return false;
    }

    private boolean isValidMove(int x, int y) {
        return x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == 0;
    }

    public void printBoard() {
        for (Integer[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println("Pasos: ");
        for(int[] i : takenSteps) {
        	System.out.println(i[0] + ", " + i[1]);
        }
    }
    
    public int[][] retBoard(){
    	int[][] ret = new int[board.length][board[0].length];
    	for(int i = 0; i < board.length; i++) {
    		for(int j = 0; j < board[i].length; j++) {
    			ret[i][j] = board[i][j]; 
    		}
    	}
    	return ret;
    }

    private int heuristic(int x, int y) {
        return Math.abs(endX - x) + Math.abs(endY - y);
    }

	public Integer[][] getBoard() {
		return board;
	}

	public void setBoard(Integer[][] board) {
		this.board = board;
	}
    
}
