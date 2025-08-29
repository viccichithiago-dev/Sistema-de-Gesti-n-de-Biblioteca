//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestionBiblioteca gestionBiblioteca = new GestionBiblioteca();
        // Objetos libros:
        Libro libro1 = new Libro("George Orwell","1984","Una novela distópica sobre un régimen totalitario que utiliza la vigilancia y la manipulación del lenguaje para controlar a la población.","Ficción");
        Libro libro2 = new Libro("J.R.R. Tolkien","El Señor de los Anillos","Una épica aventura en la Tierra Media donde un hobbit y sus compañeros buscan destruir un anillo poderoso para salvar su mundo.","Fantasía");
        Libro libro3 = new Libro("Harper Lee","Matar a un ruiseñor","Una novela que aborda temas de racismo e injusticia en el sur de Estados Unidos a través de los ojos de una niña.","Ficción");
        Libro libro4 = new Libro("Gabriel García Márquez","Cien años de soledad","Una saga familiar que mezcla realismo mágico y elementos históricos en el pueblo ficticio de Macondo.","Realismo mágico");
        gestionBiblioteca.agregarLibro(libro1);
        gestionBiblioteca.agregarLibro(libro2);
        gestionBiblioteca.agregarLibro(libro3);
        gestionBiblioteca.agregarLibro(libro4);
        //Objetos usuarios
        Usuario usuario1 = new Usuario("Alice", "Smith", 11111111);
        Usuario usuario2 = new Usuario("Bob", "Johnson", 22222222);
        Usuario usuario3 = new Usuario("Charlie", "Brown", 33333333);
        Usuario usuario4 = new Usuario("Diana", "White", 44444444);
        gestionBiblioteca.agregarUsuario(usuario1);
        gestionBiblioteca.agregarUsuario(usuario2);
        gestionBiblioteca.agregarUsuario(usuario3);
        gestionBiblioteca.agregarUsuario(usuario4);

        // Objetos prestamo
        System.out.println(gestionBiblioteca.realizarPrestamo(libro1, usuario1));
        System.out.println(gestionBiblioteca.realizarPrestamo(libro2, usuario2));
        System.out.println(gestionBiblioteca.realizarPrestamo(libro3, usuario3));
        System.out.println(gestionBiblioteca.realizarPrestamo(libro4, usuario4));
        // Lista de Usuarios:
        for (Usuario u : gestionBiblioteca.getListaDeUsuarios()) {
            System.out.println("Usuario: " + u.getNombre() + " " + u.getApellido() + ", DNI: " + u.getDni());
        }
        //Lista de Libros:
        for (Libro l : gestionBiblioteca.getListaDeLibros()) {
            System.out.println("Libro: " + l.getNombre() + ", Autor: " + l.getAutor());
        }
        //Lista de Prestamos:
        var x = gestionBiblioteca.getListaDePrestamos();
        for (Prestamo p : x) {
            System.out.println("Prestamo: " + p.getLibro().getNombre() + ", Usuario: " + p.getUsuario().getNombre() + ", Fecha: " + p.getFechaDelPrestamo());
        }
        System.out.println("-----Despues de eliminar 2 prestamos-----");
        // Eliminar 2 prestamos
        for (int i = 0; i < 2; i++) {
            Prestamo prestamoAEliminar = x.iterator().next();
            prestamoAEliminar.getLibro().setDisponibilidad(true);
            gestionBiblioteca.eliminarPrestamo(prestamoAEliminar);
        }
        var b = gestionBiblioteca.getListaDePrestamos();
        for (Prestamo p : b) {
            System.out.println("Prestamo: " + p.getLibro().getNombre() + ", Usuario: " + p.getUsuario().getNombre() + ", Fecha: " + p.getFechaDelPrestamo());
        }
        //Modificacion de libros:
        //Vamos a cambiar su disponibilidad y su genero o reseña de 3 libros de 4
        libro1.setReseña("La reseña a sido actualizada");
        libro1.setDisponibilidad(false);
        libro2.setGenero("Terror");
        libro2.setReseña("La reseña fue removida");
        System.out.println("-----Despues de modificar 2 libros-----");
        System.out.println("Libro: " + libro1.getNombre() + ", Autor: " + libro1.getAutor() + ", Reseña: " + libro1.getReseña() + ", Genero: " + libro1.getGenero() + ", Disponibilidad: " + libro1.isDisponibilidad());
        System.out.println("Libro: " + libro2.getNombre() + ", Autor: " + libro2.getAutor() + ", Reseña: " + libro2.getReseña() + ", Genero: " + libro2.getGenero() + ", Disponibilidad: " + libro2.isDisponibilidad());
        //Buscar libro
        String nombreDelLibroABuscar = "El señor de los anillos";
        System.out.println(gestionBiblioteca.buscarLibro(nombreDelLibroABuscar));
    }
}