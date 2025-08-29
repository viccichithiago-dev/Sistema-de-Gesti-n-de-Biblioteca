import java.util.HashSet;

public class GestionBiblioteca {
    private HashSet<Libro> listaDeLibros = new HashSet();
    private HashSet<Usuario> listaDeUsuarios = new HashSet();
    private HashSet<Prestamo> listaDePrestamos = new HashSet();
    //Constructor
    public GestionBiblioteca(){}
    //Metodos de la gestion
    public HashSet<Libro> getListaDeLibros() {
        return this.listaDeLibros;
    }
    public HashSet<Usuario> getListaDeUsuarios() {
        return this.listaDeUsuarios;
    }
    public HashSet<Prestamo> getListaDePrestamos() {
        return this.listaDePrestamos;
    }   
    public void agregarLibro(Libro libro){
        listaDeLibros.add(libro);
    }
    public void agregarUsuario(Usuario usuario){
        listaDeUsuarios.add(usuario);
    }
    public void agregarPrestamos(Prestamo prestamo){
        listaDePrestamos.add(prestamo);
    }
    public String eliminarLibro(String nombreDelLibro){
        for (Libro buscarLibro : listaDeLibros){
            if(nombreDelLibro.equals(buscarLibro.getNombre())){
                listaDeLibros.remove(buscarLibro);
                return  "El libro fue eliminado";
            }
        }
        return "El libro no fue encontrado!";
    }
    public String eliminarLibro(String nombreDelAuthor,String nombreDelLibro){
        for (Libro buscarLibro : listaDeLibros){
            if(nombreDelAuthor.equals(buscarLibro.getAutor()) && nombreDelLibro.equals(buscarLibro.getNombre()) ){
                listaDeLibros.remove(buscarLibro);
                return  "El libro fue eliminado";
            }
        }
        return "El libro no fue encontrado!";
    }
    public String eliminarUsuario(int dni){
        for (Usuario usuarios : listaDeUsuarios){
            if(usuarios.getDni() == dni){
                listaDeUsuarios.remove(usuarios);
                return "El usuario fue eliminado!";
            }
        }
        return "El usuario no fue encontrado!";
    }
    public String eliminarUsuario(String nombre,String apellido){
        for (Usuario usuarios : listaDeUsuarios){
            if(nombre.equals(usuarios.getNombre()) && apellido.equals(usuarios.getApellido())){
                listaDeUsuarios.remove(usuarios);
                return "El usuario fue eliminado!";
            }
        }
        return "El usuario no fue encontrado!";
    }
    public void eliminarPrestamo(Prestamo prestamo){
        listaDePrestamos.remove(prestamo);
    }

    public String realizarPrestamo(Libro libro, Usuario usuario){
        if(libro.isDisponibilidad()){
            Prestamo prestamo = new Prestamo(libro,26,usuario);
            libro.setDisponibilidad(false);
            this.agregarPrestamos(prestamo);
            return "Prestamo Realizado con Exito!";
        }
        return "Prestamo no realizado con exito!";
    }
    public String buscarLibro(String nombreABuscar){
        if (nombreABuscar == null || nombreABuscar.isBlank()) {
            throw new DatoIncorrecto("El nombre del libro no puede ser nulo o estar en blanco");
        }
        for (Libro libro : listaDeLibros) {
            if (libro.getNombre().equalsIgnoreCase(nombreABuscar)) {
                return "Libro encontrado: " + libro.getNombre() + ", Autor: " + libro.getAutor();
            }
        }
        return "Libro no encontrado!";
    }
}
