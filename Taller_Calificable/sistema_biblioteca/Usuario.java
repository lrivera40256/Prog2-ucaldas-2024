// nombre (String): Nombre completo del usuario.
// cedula (String): Cédula de identidad del usuario.

package sistema_biblioteca;

public class Usuario {
    private String nombre = "";
    private String cedula = "";

    public Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
