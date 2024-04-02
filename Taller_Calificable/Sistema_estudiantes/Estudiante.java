// Se debe crear una clase Estudiante con los siguientes atributos:
// nombre (String): Nombre completo del estudiante.
// codigo (String): Código único de identificación del estudiante.
// carrera (String): Carrera que estudia el estudiante.
// promedio (double): Promedio académico del estudiante

public class Estudiante {
    private String nombre = "";
    private String codigo = "";
    private String carrera = "";
    private float promedio = 0;

    public Estudiante(String nombre, String codigo, String carrera, float promedio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante: \n - Nombre = " + nombre + "\n - Código = " + codigo + "\n - Carrera = " + carrera +
                "\n - Promedio = " + promedio;
    }
}