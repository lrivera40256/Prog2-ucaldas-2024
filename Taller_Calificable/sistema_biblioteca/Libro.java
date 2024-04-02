package sistema_biblioteca;

// titulo (String): Título del libro.
// autor (Autor): Autor del libro.
// isbn (String): ISBN del libro.
// categoria (String): Categoría del libro.
// ejemplares (int): Número de ejemplares disponibles del libro
public class Libro {
    private String titulo = "";
    private Autor autor;
    private String isbn = "";
    private String categoria = "";
    private int ejemplares = 0;

    public Libro(String titulo, Autor autor, String isbn, String categoria, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.categoria = categoria;
        this.ejemplares = ejemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public String toString() {
        return "Libro: \nTitulo: " + titulo + "\nAutor: " + autor + "\nISBN: " + isbn + "\nCategoria:" + categoria
                + "\nEjemplares: " + ejemplares;
    }

}