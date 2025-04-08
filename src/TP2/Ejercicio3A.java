/*
a) Crear un programa que almacene en un vector los nombres de 10 libros
    - Permitir al usuario ingresar un título o parte del título
    - Buscar si existe una coincidencia (búsqueda parcial, contains())
    - Mostrar su posición en el vector si existe
 */

package TP2;
import java.util.Scanner;

public class Ejercicio3A {
    public static void buscarLibro(String[] libros) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el título o parte del título a buscar: ");
        String busqueda = scanner.nextLine().toLowerCase();

        boolean encontrado = false;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].toLowerCase().contains(busqueda)) {
                System.out.println("Coincidencia en la posición: " + i + " -> " + libros[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron coincidencias.");
        }
    }

    public static void main(String[] args) {
        String[] libros = {"Java Básico", "Estructuras de Datos", "Programación en C", "Python Avanzado",
                "Bases de Datos", "JavaScript Moderno", "Redes y Sistemas", "Algoritmos",
                "Arquitectura de Computadoras", "Sistemas Operativos"};
        buscarLibro(libros);
    }
}
