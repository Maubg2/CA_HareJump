package co.edu.unbosque.model;

import java.util.*;
import java.util.*;

import java.util.*;

public class HareJump1 {

    private int[][] moves;
    private int[][] board;
    private int endX, endY;
    private int n, m;
    private int p, q;
    private boolean success;

    public HareJump1(int n, int m, int x0, int y0, int endX, int endY, int p, int q) {
        this.n = n;
        this.m = m;
        this.endX = endX;
        this.endY = endY;
        this.p = p;
        this.q = q;
        board = new int[n][m];
        moves = generateMoves();

        if (x0 < 0 || x0 >= m || y0 < 0 || y0 >= n || endX < 0 || endX >= m || endY < 0 || endY >= n) {
            System.out.println("Posición inicial o final fuera de los límites del tablero");
            return;
        }

        success = hop(x0, y0);

        if (success) {
            System.out.println("Se encontró un camino hacia la posición final:");
            printBoard();
        } else {
            System.out.println("No se encontró un camino hacia la posición final.");
        }
    }

    private int[][] generateMoves() {
        return new int[][]{
            {p, q}, {p, -q}, {-p, q}, {-p, -q},
            {q, p}, {q, -p}, {-q, p}, {-q, -p}
        };
    }

    private boolean hop(int x, int y) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> (a.heuristicCost)));
        pq.add(new Node(x, y, 1, heuristicCost(x, y)));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            x = current.x;
            y = current.y;

            if (x == endX && y == endY) {
                reconstructPath(current);
                return true;
            }

            board[x][y] = -1; // Mark as visited

            for (int[] move : moves) {
                int nx = x + move[0];
                int ny = y + move[1];

                if (isValidMove(nx, ny)) {
                    int gCost = current.gCost + 1;
                    int hCost = heuristicCost(nx, ny);
                    int fCost = gCost + hCost;

                    pq.add(new Node(nx, ny, gCost, hCost, fCost, current));
                }
            }
        }

        return false;
    }

    private boolean isValidMove(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n && board[x][y] == 0;
    }

    private void reconstructPath(Node current) {
        while (current != null) {
            board[current.x][current.y] = current.gCost;
            current = current.parent;
        }
    }

    private int heuristicCost(int x, int y) {
        return Math.abs(endX - x) + Math.abs(endY - y);
    }

    private void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private static class Node {
        int x, y, gCost, heuristicCost, fCost;
        Node parent;

        Node(int x, int y, int gCost, int heuristicCost) {
            this.x = x;
            this.y = y;
            this.gCost = gCost;
            this.heuristicCost = heuristicCost;
        }

        Node(int x, int y, int gCost, int heuristicCost, int fCost, Node parent) {
            this(x, y, gCost, heuristicCost);
            this.fCost = fCost;
            this.parent = parent;
        }
    }

    public static void main(String[] args) {
        int n = 100, m = 100; // Dimensiones del tablero
        int x0 = 0, y0 = 0; // Posición inicial de la liebre
        int endX = 50, endY = 50; // Posición objetivo
        int p = 2, q = 1; // Cantidad de casillas que puede saltar la liebre

        HareJump1 hareJumpAStar = new HareJump1(n, m, x0, y0, endX, endY, p, q);
    }

	public int[][] getBoard() {
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
   
    
    
}








