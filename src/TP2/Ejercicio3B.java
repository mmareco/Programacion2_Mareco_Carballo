/*
b)Plantear otra solución a este problema considerando que no se sabe la cantidad de libros que existen
 */

package TP2;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3B {
    public static void main(String[] args) {
        ArrayList<String> libros = cargarLibros();
        buscarLibro(libros);
    }

    public static ArrayList<String> cargarLibros() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> libros = new ArrayList<>();

        System.out.println("Ingrese los títulos de los libros (escriba 'fin' para terminar):");
        while (true) {
            String libro = scanner.nextLine();
            if (libro.equalsIgnoreCase("fin")) break;
            libros.add(libro);
        }

        return libros;
    }

    public static void buscarLibro(ArrayList<String> libros) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el título o parte del título a buscar: ");
        String busqueda = scanner.nextLine().toLowerCase();

        boolean encontrado = false;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).toLowerCase().contains(busqueda)) {
                System.out.println("Coincidencia en la posición " + i + ": " + libros.get(i));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron coincidencias.");
        }
    }
}
