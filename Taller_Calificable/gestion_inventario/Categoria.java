package gestion_inventario;

// Se debe crear una clase Categoria con los siguientes atributos:
// nombre (String): Nombre de la categoría.
// descripcion (String): Descripción de la categoría.

public class Categoria {
    String nombre;
    String descripcion;

    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoria [nombre=" + nombre + ", descripcion=" + descripcion + "]";
    }
}
