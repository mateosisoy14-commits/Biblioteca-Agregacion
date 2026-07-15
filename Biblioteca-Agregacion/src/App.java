public class App {
    // M
    public static void main(String[] args) {
       
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez");
        Libro libro3 = new Libro("El principito", "Antoine de Saint-Exupéry");

        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Luis Ángel Arango");
        
        // A
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println();
        biblioteca.mostrarCatalogo();
        biblioteca.buscarPorAutor("Gabriel García Márquez");
    }
}