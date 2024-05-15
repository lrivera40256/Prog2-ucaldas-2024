package gestion_inventario;

// Se debe crear una clase Proveedor con los siguientes atributos:
// nombre (String): Nombre del proveedor.
// telefono (String): Teléfono del proveedor.
// direccion (String): Dirección del proveedor.

public class Proveedor {
    String nombre;
    String telefono;
    String direccion;

    public Proveedor(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Proveedor [nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + "]";
    }
}
