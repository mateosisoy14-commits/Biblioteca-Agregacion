public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    // C
    public Libro() {
        this.disponible = true;
    }

    // C
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    // C
    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    // M
    public void mostrarInfo() {
        System.out.println("---- Libro ----");
        System.out.println("Título   : " + titulo);
        System.out.println("Autor    : " + autor);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    // M
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" fue prestado.");
            return true;
        } else {
            System.out.println("El libro \"" + titulo + "\" ya está prestado.");
            return false;
        }
    }

    // M
    public void devolver() {
        disponible = true;
        System.out.println("El libro \"" + titulo + "\" fue devuelto.");
    }
}