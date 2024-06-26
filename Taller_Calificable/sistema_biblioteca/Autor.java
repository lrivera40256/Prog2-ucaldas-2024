package sistema_biblioteca;

// nombre (String): Nombre completo del autor.
// nacionalidad (String): Nacionalidad del autor.

public class Autor {
    private String nombre = "";
    private String nacionalidad = "";

    public Autor() {
    }

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor: \nNombre: " + nombre + "\nNacionalidad: " + nacionalidad;
    }

}