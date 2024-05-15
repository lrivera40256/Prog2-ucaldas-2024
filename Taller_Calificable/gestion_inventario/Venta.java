package gestion_inventario;

import java.util.Date;

// Se debe crear una clase Venta con los siguientes atributos:
// producto (Producto): Producto vendido.
// cantidad (int): Cantidad de unidades del producto vendidas.
// fechaVenta (Date): Fecha en la que se realizó la venta

public class Venta {
    Producto producto;
    int cantidad;
    Date fechaVenta;

    public Venta(Producto producto, int cantidad, Date fechaVenta) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.fechaVenta = fechaVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        return "Venta [producto=" + producto + ", cantidad=" + cantidad + ", fechaVenta=" + fechaVenta + "]";
    }
}