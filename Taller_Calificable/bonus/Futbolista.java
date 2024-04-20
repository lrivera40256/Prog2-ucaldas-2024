package bonus;

public class Futbolista {
    private String nombre;
    private String posicion;
    private String dorsal;
    private String nacionalidad;

    public Futbolista(String nombre, String posicion, String dorsal, String nacionalidad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Futbolista \n Nombre = " + nombre + "\n Posicion = " + posicion + "\n Dorsal = " + dorsal
                + "\n Nacionalidad = "
                + nacionalidad;
    }
}