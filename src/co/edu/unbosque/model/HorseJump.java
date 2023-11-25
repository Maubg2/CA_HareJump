package co.edu.unbosque.model;

public class HorseJump {
    
    // Definición de variables miembro
    
    public int N = 8;  // Tamaño del tablero de ajedrez
    private int n;  // Tamaño del tablero de ajedrez más 1
    private int[][] board;  // Matriz que representa el tablero de ajedrez
    private boolean success;  // Variable para indicar si se ha encontrado una solución
    private int[][] jump = {{2, 1}, {1, 2}, {-1, 2}, {-2, 1},
                            {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};  // Posibles movimientos del caballo
    private int x0, y0;  // Posición inicial del caballo en el tablero

    // Constructor de la clase
    public HorseJump(int x, int y) throws Exception {
        n = (N + 1);
        board = new int[n][n];  // Inicializa la matriz del tablero
        
        // Verifica que la posición inicial esté dentro del rango del tablero
        if ((x < 1) || (x > N) || (y < 1) || (y > N)) {
            throw new Exception("Out of range.");
        }
        
        x0 = x;
        y0 = y;
        
        // Inicializa el tablero, marcando todas las posiciones como no visitadas
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                board[i][j] = 0;
            }
        }
        
        board[x0][y0] = 1;  // Marca la posición inicial como visitada
        success = false;  // Inicializa la variable de éxito
        
    }
    
    // Método para resolver el problema del salto del caballo
    
    public boolean solve() {
        hop(x0, y0, 2);
        return success;
    }
    
    // Método recursivo para realizar el salto del caballo
    
    private void hop(int x, int y, int i) {
       
        int nx, ny;
        int k;
        k = 0;
        
        // Ciclo do-while para explorar todos los movimientos posibles del caballo
        
        do {
            k++;
            nx = x + jump[k-1][0];
            ny = y + jump[k-1][1];
            
            // Verifica que la posición siguiente sea válida y no visitada
            
            if ((nx >= 1) && (nx <= N) && (ny >= 1) && (ny <= N) && (board[nx][ny] == 0)) {
                board[nx][ny] = i;  // Marca el movimiento
                
                // Si no se han realizado todos los movimientos, realiza el próximo movimiento recursivamente
                
                if (i < N * N) {
                    hop(nx, ny, i + 1);
                    
                    // Si no se encontró una solución, retrocede el movimiento actual
                    if (!success) {
                        board[nx][ny] = 0;
                    }
                } else {
                    success = true;  // Se ha encontrado una solución
                }
            }
        } while ((k < 8) && !success);  // Repite hasta que se hayan explorado todos los movimientos o se encuentre una solución
    }
    
    // Método para imprimir el tablero
    
    public void writeBoard() {
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
