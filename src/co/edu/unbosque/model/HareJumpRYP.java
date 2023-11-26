package co.edu.unbosque.model;
import java.util.*;

public class HareJumpRYP {

    private int[][] jumps;
    private int[][] board;
    private int endX, endY;
    private int[][] moves = {{1, 2}, {-1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, 1}, {-2, -1}};

    public HareJumpRYP(int p, int q, int n, int m, int x0, int y0, int endX, int endY) {
        this.endX = endX;
        this.endY = endY;
        jumps = new int[][]{{p, q}, {q, p}, {-q, p}, {-p, q}, {-p, -q}, {-q, -p}, {q, -p}, {p, -q}};
        board = new int[n][m];

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
        int step = 1;

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            x = current[0];
            y = current[1];
            board[x][y] = step++;
            
            
            if (x == endX && y == endY) {
                return true;
            }

            for (int[] move : moves) {
                int nx = x + move[0];
                int ny = y + move[1];

                if (isValidMove(nx, ny)) {
                    pq.add(new int[]{nx, ny});
                }
            }
        }
        return false;
    }

    private boolean isValidMove(int x, int y) {
        return x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == 0;
    }

    public void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private int heuristic(int x, int y) {
        return Math.abs(endX - x) + Math.abs(endY - y);
    }
}
