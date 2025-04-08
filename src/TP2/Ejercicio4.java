/*
Registrar temperaturas diarias (7 días) durante 4 semanas. El programa debe:
    - Calcular la temperatura media semanal
    - Calcular la temperatura media mensual
    - Indicar el día más caluroso y el más frío del mes (semana y día)
 */

package TP2;
import java.util.Scanner;

public class Ejercicio4 {
    public static double[][] cargarTemperaturas() {
        Scanner scanner = new Scanner(System.in);
        double[][] temperaturas = new double[4][7];

        for (int semana = 0; semana < 4; semana++) {
            for (int dia = 0; dia < 7; dia++) {
                System.out.print("Temperatura día " + (dia + 1) + " de la semana " + (semana + 1) + ": ");
                temperaturas[semana][dia] = scanner.nextDouble();
            }
        }

        return temperaturas;
    }

    public static double calcularTemperaturaMediaMensual(double[][] temperaturas) {
        double sumaTotal = 0;
        for (int semana = 0; semana < 4; semana++) {
            for (int dia = 0; dia < 7; dia++) {
                sumaTotal += temperaturas[semana][dia];
            }
        }
        return sumaTotal / 28;
    }

    public static void mostrarResultados(double[][] temperaturas, double mediaMensual) {
        double maxTemp = Double.MIN_VALUE, minTemp = Double.MAX_VALUE;
        int semanaMax = 0, diaMax = 0, semanaMin = 0, diaMin = 0;

        for (int semana = 0; semana < 4; semana++) {
            double sumaSemana = 0;
            for (int dia = 0; dia < 7; dia++) {
                sumaSemana += temperaturas[semana][dia];
                if (temperaturas[semana][dia] > maxTemp) {
                    maxTemp = temperaturas[semana][dia];
                    semanaMax = semana + 1;
                    diaMax = dia + 1;
                }
                if (temperaturas[semana][dia] < minTemp) {
                    minTemp = temperaturas[semana][dia];
                    semanaMin = semana + 1;
                    diaMin = dia + 1;
                }
            }
            System.out.println("Media de la semana " + (semana + 1) + ": " + (sumaSemana / 7));
        }

        System.out.println("Temperatura media del mes: " + mediaMensual);
        System.out.println("Día más caluroso: Semana " + semanaMax + ", Día " + diaMax + " (Temp: " + maxTemp + ")");
        System.out.println("Día más frío: Semana " + semanaMin + ", Día " + diaMin + " (Temp: " + minTemp + ")");
    }

    public static void main(String[] args) {
        double[][] temperaturas = cargarTemperaturas();
        double mediaMensual = calcularTemperaturaMediaMensual(temperaturas);
        mostrarResultados(temperaturas, mediaMensual);
    }
}
