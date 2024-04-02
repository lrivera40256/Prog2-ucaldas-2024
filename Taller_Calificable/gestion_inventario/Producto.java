// Se debe crear una clase Producto con los siguientes atributos:
// nombre (String): Nombre del producto.
// categoria (Categoria): Categoría del producto.
// precio (double): Precio de venta del producto.
// stock (int): Cantidad de unidades del producto en stock.

package gestion_inventario;

public class Producto {
    String nombre;
    Categoria categoria;
    double precio;
    int stock;

    public Producto(String nombre, Categoria categoria, double precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", stock=" + stock
                + "]";
    }
}
