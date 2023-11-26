package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public class HareJump {

    private int[][] jumps;
    private int[][] board;
    private boolean success;
    private int endX, endY;

    public HareJump(int p, int q, int n, int m, int x0, int y0, int endX, int endY) {
        this.endX = endX;
        this.endY = endY;
        jumps = new int[][]{{p, q}, {q, p}, {-q, p}, {-p, q}, {-p, -q}, {-q, -p}, {q, -p}, {p, -q}};
        board = new int[n][m];

        if (x0 < 0 || x0 >= m || y0 < 0 || y0 >= n) {
            JOptionPane.showMessageDialog(null, "La posición inicial de la liebre sobrepasa los límites del tablero");
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
        }

        board[0][0] = 1;
        success = false;

        success = hop(x0, y0, 1);
    }

    private boolean hop(int x, int y, int step) {
        if (x == endX && y == endY) {
            success = true;
            return true;
        }

        int minDistance = Integer.MAX_VALUE;
        int nextX = -1;
        int nextY = -1;

        for (int k = 0; k < 8; k++) {
            int nx = x + jumps[k][0];
            int ny = y + jumps[k][1];

            if (isValidMove(nx, ny)) {
                int distance = heuristic(nx, ny, endX, endY);
                if (distance < minDistance) {
                    minDistance = distance;
                    nextX = nx;
                    nextY = ny;
                }
            }
        }

        if (nextX != -1 && nextY != -1) {
            step++;
            board[nextX][nextY] = step;
            return hop(nextX, nextY, step);
        }

        return false;
    }

    private boolean isValidMove(int x, int y) {
        return x >= 0 && x < board[0].length && y >= 0 && y < board.length && board[x][y] == 0;
    }

    public void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private int heuristic(int x, int y, int endX, int endY) {
        return Math.abs(endX - x) + Math.abs(endY - y);
    }

}
