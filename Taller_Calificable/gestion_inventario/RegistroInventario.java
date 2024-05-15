package gestion_inventario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Se debe crear una clase RegistroInventario con los siguientes métodos:
// a. registrarProducto(Producto producto): Agrega un producto al registro. Este método debe realizar las mismas
// validaciones que el ejercicio anterior.
// b. registrarCategoria(Categoria categoria): Agrega una categoría al registro.
// c. registrarProveedor(Proveedor proveedor): Agrega un proveedor al registro.
// d. registrarVenta(Venta venta): Registra una venta de un producto. Este método debe realizar las siguientes
// validaciones:
// El producto debe tener stock disponible.
// a. listarProductos(): Imprime en la consola la información de todos los productos registrados.
// b. listarCategorias(): Imprime en la consola la información de todas las categorías registradas
// c. listarProveedores(): Imprime en la consola la información de todos los proveedores registrados.
// d. listarVentas(): Imprime en la consola la información de todas las ventas registradas.
// e. buscarProductos(String filtro): Busca y retorna una lista de productos que coincidan con el filtro especificado. El
// filtro puede ser una cadena que se compara con el nombre, la categoría o el precio del producto.

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RegistroInventario {
    Scanner scn = new Scanner(System.in);
    ArrayList<Producto> listaProductos = new ArrayList<>();
    ArrayList<Categoria> listaCategorias = new ArrayList<>();
    ArrayList<Proveedor> listaProveedores = new ArrayList<>();
    ArrayList<Venta> listaVentas = new ArrayList<>();

    public ArrayList<Categoria> filtrarCategoria(String palabra) {
        ArrayList<Categoria> listaFiltradaCategoria = new ArrayList<>();
        for (Categoria categoria : listaFiltradaCategoria) {
            if (categoria.getNombre().equals(palabra)) {
                listaFiltradaCategoria.add(categoria);
            }
        }

        return listaFiltradaCategoria;
    }

    // Métodos que crean producto, proveedor, venta y categoria

    public Producto crearProducto() {
        System.out.println("Ingrese el nombre del producto");
        String nombre = scn.nextLine();

        System.out.println("Ingrese la categoria del producto");
        String nomCat = scn.nextLine();
        Categoria categoria;
        if (filtrarCategoria(nomCat).size() == 0) {
            categoria = crearCategoria();
            registrarCategoria(categoria);
        }

        if (filtrarCategoria(nomCat).get(0).getNombre().equals(nomCat)) {
            categoria = filtrarCategoria(nomCat).get(0);
        } else {
            categoria = crearCategoria();
            registrarCategoria(categoria);
        }

        double precio;
        do {
            System.out.println("¿Cuanto cuesta el producto");
            precio = scn.nextDouble();
            if (precio <= 0) {
                System.out.println("Ingrese un precio válido");
            }
        } while (precio <= 0);

        int stock;
        do {
            System.out.println("¿Cuantas unidades desea registrar del producto");
            stock = scn.nextInt();
            if (stock <= 0) {
                System.out.println("Ingrese una cantidad válida");
            }
        } while (stock <= 0);

        Producto producto = new Producto(nombre, categoria, precio, stock);
        return producto;
    }

    public Categoria crearCategoria() {
        System.out.println("Ingrese el nombre de la categoria");
        String nombre = scn.nextLine();
        System.out.println("Ingrese una descripción de la categoria");
        String descripcion = scn.nextLine();
        Categoria categoria = new Categoria(nombre, descripcion);
        return categoria;
    }

    public Proveedor crearProveedor() {
        System.out.println("Ingrese el nombre del proveedor");
        String nombre = scn.nextLine();
        System.out.println("Ingrese el telefono del proveedor");
        String telefono = scn.nextLine();
        System.out.println("Ingrese la direccion del proveedor");
        String direccion = scn.nextLine();

        Proveedor proveedor = new Proveedor(nombre, telefono, direccion);
        return proveedor;
    }

    public Venta crearVenta() {
        System.out.println("Ingrese el nombre del producto");
        String nombreProd = scn.nextLine();
        Producto producto;
        if (filtrarProducto(nombreProd).size() == 0) {
            producto = crearProducto();
            registrarProducto(producto);
        }

        if (filtrarProducto(nombreProd).get(0).getNombre().equals(nombreProd)) {
            producto = filtrarProducto(nombreProd).get(0);
        } else {
            producto = crearProducto();
            registrarProducto(producto);
        }

        int cantidad;
        do {
            System.out.println("¿Cuantos productos desea registrar");
            cantidad = scn.nextInt();
            if (cantidad <= 0) {
                System.out.println("Ingrese una cantidad válida");
            }
        } while (cantidad <= 0);

        Date fechaVenta = new Date();

        Venta venta = new Venta(producto, cantidad, fechaVenta);
        return venta;
    }

    // Métodos que registran productos, ventas, proveedores y categorias

    public void registrarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public void registrarCategoria(Categoria categoria) {
        listaCategorias.add(categoria);
    }

    public void registrarProveedor(Proveedor proveedor) {
        listaProveedores.add(proveedor);
    }

    public void registrarVenta(Venta venta) {
        if (venta.getProducto().getStock() - venta.getCantidad() >= 0) {
            listaVentas.add(venta);
        } else {
            System.out.println("El producto no tiene stock disponible");
        }
    }

    // Métodos que muestran una lista de los productos,
    // categorias, proveedores o ventas

    public void listarProductos() {
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }

    public void listaCategorias() {
        for (Categoria categoria : listaCategorias) {
            System.out.println(categoria);
        }
    }

    public void listaProveedores() {
        for (Proveedor proveedor : listaProveedores) {
            System.out.println(proveedor);
        }
    }

    public void listarVentas() {
        for (Venta venta : listaVentas) {
            System.out.println(venta);
        }
    }

    // Método que filtra los productos por nombre, categoria o precio
    public ArrayList<Producto> filtrarProducto(String palabra) {
        ArrayList<Producto> listaFiltradaProducto = new ArrayList<>();
        for (Producto producto : listaProductos) {
            String precio = String.valueOf(producto.getPrecio());
            if ((producto.getNombre().equals(palabra)) || (producto.getCategoria().getNombre().equals(palabra))
                    || (precio.equals(palabra))) {
                listaFiltradaProducto.add(producto);
            }
        }
        return listaFiltradaProducto;
    }

    // Método que muestra el menú principal
    public String menuPrincipal() {
        System.out.println("¿Qúe deseas hacer? Ingrese la opción deseada");
        System.out.println("1- Registrar un producto en el sistema");
        System.out.println("2- Registrar una categoria en el sistema");
        System.out.println("3- Registrar proveedor");
        System.out.println("4- Registrar venta");

        return scn.nextLine();
    }

    // Metodo que encuentre el producto con menor stock
    public String menorStock() {
        Producto producto = listaProductos.get(0);

        for (int i = 1; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getStock() < producto.getStock()) {
                producto = listaProductos.get(i);
            }
        }

        return producto.getNombre();
    }

    // Método para leer un archivo y agregar los objetos al ArrayList
    public void leer_archivo_productos(ArrayList<Producto> lista) {
        try {
            BufferedReader lector = new BufferedReader(
                    new FileReader("gestion_inventario\\listaProductos.txt"));
            String linea = "";
            while ((linea = lector.readLine()) != null) {
                String[] bloques = linea.split("\t");

                if (bloques.length == 5) {
                    String nombre = bloques[0];
                    String nomCat = bloques[1];
                    String descripcion = bloques[2];
                    double precio = Double.parseDouble(bloques[3]);
                    int stock = Integer.parseInt(bloques[4]);

                    Categoria categoria = new Categoria(nomCat, descripcion);
                    lista.add(new Producto(nombre, categoria, precio, stock));
                }
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }

}
