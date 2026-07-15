public class Biblioteca {
    private String nombre;
    private Libro[] catalogo; 
    private int cantidad;

    // C
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.catalogo = new Libro[10]; 
        this.cantidad = 0;
    }

    public String getNombre() { return nombre; }

    // M
    public void agregarLibro(Libro libro) {
        if (cantidad < catalogo.length) {
            catalogo[cantidad] = libro; 
            cantidad++;
            System.out.println("Libro \"" + libro.getTitulo() + "\" agregado al catálogo.");
        } else {
            System.out.println("El catálogo está lleno.");
        }
    }

    // M
    public void mostrarCatalogo() {
        System.out.println("\n--- Catálogo de " + nombre + " ---");
        for (int i = 0; i < cantidad; i++) {
            catalogo[i].mostrarInfo(); 
        }
    }

    // M
    public void buscarPorAutor(String autor) {
        System.out.println("\nBuscando libros de \"" + autor + "\":");
        boolean encontrado = false;
        for (int i = 0; i < cantidad; i++) {
            // LLAMADA: usamos el método getAutor() del objeto libro
            if (catalogo[i].getAutor().equalsIgnoreCase(autor)) {
                System.out.println(" - " + catalogo[i].getTitulo());
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No se encontraron libros.");
    }
}