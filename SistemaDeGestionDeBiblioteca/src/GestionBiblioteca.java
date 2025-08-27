import java.util.HashSet;

import static java.lang.System.in;

public class GestionBiblioteca {
    HashSet<Libro> listaDeLibros = new HashSet();
    HashSet<Usuario> listaDeUsuarios = new HashSet();
    HashSet<Prestamo> listaDePrestamos = new HashSet();
    //Metodos de la gestion
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
            return "Prestamo Realizado con Exito!";
        }
        return "Prestamo no realizado con exito!";
    }
}
