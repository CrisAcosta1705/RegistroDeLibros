package RegistroDeLibros;

public class LibroDigital extends Libro {
    private String formato;

    public LibroDigital(String nombre, String editorial, String autor, int año, String formato) {
        super(nombre, editorial, autor, año);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Formato: " + formato);
    }
}