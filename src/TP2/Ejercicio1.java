/*
Crear un programa, con estructura estática, que registre las notas de 5 estudiantes en 4 materias diferentes (usar un matriz 5x4). El sistema debe:
    - Cargar las notas por alumno
    - Calcular el promedio por alumno
    - Indicar cuál fue el alumno con el mayor promedio
 */

package TP2;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double[][] Notas = cargar_notas();
        double[] Promedio = Calcular_promedio(Notas);
        mostar_promedios(Promedio);
        mostar_mejor_promedio(Promedio);
    }

    private static double[] Calcular_promedio(double[][] Notas) {
        double[] Promedio = new double[5];
        for (int i = 0; i < 5 ; i ++) {
            double sumar_notas = 0;
            for (int j = 0; j < 4; j++) {
                sumar_notas += Notas[i][j];
            }
            Promedio[i] = sumar_notas / 4;
        }
        return Promedio;
    }

    public static double[][] cargar_notas(){
        Scanner scanner= new Scanner(System.in);
        double[][] Notas = new double[5][4];
        for (int i = 0; i < 5 ; i ++){
            System.out.println("Ingrese las notas del alumno"+ (i+1)+": ");
            for (int j = 0; j < 4 ; j++){
                System.out.println("Cuanto se saco en la materia"+ (j+1)+":");
                Notas[i][j] = scanner.nextDouble();
            }

        }
        return Notas;
    }


    public static void mostar_promedios(double[]Promedio){
        for (int i = 0; i < 5 ; i ++) {
            System.out.println("el promedio del alumno"+ (i+1) +"=" + Promedio[i]);
        }
    }
    public static void mostar_mejor_promedio(double[]Promedio){
        int mejor_alumno= 0;
        for (int i = 0; i < 5 ; i ++) {
            if (mejor_alumno < Promedio[i]) {
                mejor_alumno = i;
            }
        }
        System.out.println("el alumno con el mejor promedio es "+ (mejor_alumno+1));
    }

}
