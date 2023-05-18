package RegistroDeLibros;
import java.util.Scanner;
public class Libro {

	 private String nombre;
	    private String editorial;
	    private String autor;
	    private int año;

	    public Libro(String nombre, String editorial, String autor, int año) {
	        this.nombre = nombre;
	        this.editorial = editorial;
	        this.autor = autor;
	        this.año = año;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getEditorial() {
	        return editorial;
	    }

	    public void setEditorial(String editorial) {
	        this.editorial = editorial;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public void setAutor(String autor) {
	        this.autor = autor;
	    }

	    public int getAño() {
	        return año;
	    }

	    public void setAño(int año) {
	        this.año = año;
	    }

	    public void mostrarInformacion() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Editorial: " + editorial);
	        System.out.println("Autor: " + autor);
	        System.out.println("Año: " + año);
	    }
	}