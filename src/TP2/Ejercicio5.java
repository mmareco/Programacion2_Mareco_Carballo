/*
Crear dos matrices cuadradas, A y B de tamaño NxN (N puede ser cualquier valor con valores aleatorios entre 1 y 10)
    - Calcular la suma A + B mostrar la matriz resultante
    - Mostrar también la diferencia A - B
 */

package TP2;
import java.util.Random;

public class Ejercicio5 {
    public static int[][] crearMatrizAleatoria(int N) {
        Random rand = new Random();
        int[][] matriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = rand.nextInt(10) + 1;
            }
        }

        return matriz;
    }

    public static int[][] sumarMatrices(int[][] A, int[][] B, int N) {
        int[][] resultado = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                resultado[i][j] = A[i][j] + B[i][j];
            }
        }

        return resultado;
    }

    public static int[][] restarMatrices(int[][] A, int[][] B, int N) {
        int[][] resultado = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                resultado[i][j] = A[i][j] - B[i][j];
            }
        }

        return resultado;
    }

    public static void mostrarMatriz(String nombre, int[][] matriz) {
        System.out.println(nombre + ":");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 3;
        int[][] A = crearMatrizAleatoria(N);
        int[][] B = crearMatrizAleatoria(N);
        int[][] suma = sumarMatrices(A, B, N);
        int[][] resta = restarMatrices(A, B, N);
        mostrarMatriz("Matriz A", A);
        mostrarMatriz("Matriz B", B);
        mostrarMatriz("Suma A + B", suma);
        mostrarMatriz("Resta A - B", resta);
    }
}
