package Sistema_estudiantes;

// Se debe crear una clase Estudiante con los siguientes atributos:
// nombre (String): Nombre completo del estudiante.
// codigo (String): Código único de identificación del estudiante.
// carrera (String): Carrera que estudia el estudiante.
// promedio (double): Promedio académico del estudiante

public class Estudiante {
    private String nombre = "";
    private String codigo = "";
    private String carrera = "";
    private double promedio = 0;

    public Estudiante(String nombre, String codigo, String carrera, double promedio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
        this.promedio = promedio;
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

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}