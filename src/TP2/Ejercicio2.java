/*
Se desea crear un sistema para controlar el stock de n productos en m depósitos. Se requiere:
    - Cargar la cantidad disponible por producto y depósito ()
    - Mostrar el stock total por producto
    - Mostrar el depósito con mayor cantidad acumulada de productos
 */

package TP2;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese la cantidad de depósitos: ");
        int m = scanner.nextInt();

        int[][] stock = new int[n][m];


        System.out.println("\n--- Carga de stock ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Cantidad del producto " + (i + 1) + " en depósito " + (j + 1) + ": ");
                stock[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n--- Stock total por producto ---");
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < m; j++) {
                total += stock[i][j];
            }
            System.out.println("Producto " + (i + 1) + ": " + total + " unidades");
        }

        System.out.println("\n--- Depósito con mayor cantidad acumulada ---");
        int maxDeposito = 0;
        int maxCantidad = 0;
        for (int j = 0; j < m; j++) {
            int suma = 0;
            for (int i = 0; i < n; i++) {
                suma += stock[i][j];
            }
            System.out.println("Depósito " + (j + 1) + ": " + suma + " unidades");
            if (suma > maxCantidad) {
                maxCantidad = suma;
                maxDeposito = j;
            }
        }

        System.out.println("El depósito con mayor cantidad acumulada es el depósito " + (maxDeposito + 1) + " con " + maxCantidad + " unidades.");

        scanner.close();
    }
}
