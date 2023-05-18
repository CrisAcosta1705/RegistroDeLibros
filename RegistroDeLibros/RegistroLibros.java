package RegistroDeLibros;
import java.util.Scanner;
public class RegistroLibros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Registro de Libros");
        System.out.print("Ingrese los datos del Libro 1:\n");
        System.out.print("Nombre: ");
        String nombreLibro1 = input.nextLine();
        System.out.print("Editorial: ");
        String editorialLibro1 = input.nextLine();
        System.out.print("Autor: ");
        String autorLibro1 = input.nextLine();
        System.out.print("Año: ");
        int añoLibro1 = input.nextInt();
        input.nextLine();
        
        System.out.print("Ingrese los datos del Libro 2:\n");
        System.out.print("Nombre: ");
        String nombreLibro2 = input.nextLine();
        System.out.print("Editorial: ");
        String editorialLibro2 = input.nextLine();
        System.out.print("Autor: ");
        String autorLibro2 = input.nextLine();
        System.out.print("Año: ");
        int añoLibro2 = input.nextInt();
        input.nextLine();
        
        Libro libro1 = new Libro(nombreLibro1, editorialLibro1, autorLibro1, añoLibro1);
        LibroDigital libro2 = new LibroDigital(nombreLibro2, editorialLibro2, autorLibro2, añoLibro2, "PDF");

        System.out.println("\nInformación de los Libros:");
        libro1.mostrarInformacion();
        System.out.println();
        libro2.mostrarInformacion();
        
        input.close();
    }
}