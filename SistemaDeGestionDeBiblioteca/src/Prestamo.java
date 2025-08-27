public class Prestamo {
    private Libro libro;
    private int fechaDelPrestamo,fechaDeDevolucion;
    private Usuario prestadoAUsuario;
    public Prestamo(Libro libro,int fechaDelPrestamo,Usuario prestadoAUsuario){
            setLibro(libro);
            setFechaDelPrestamo(fechaDelPrestamo);
            setPrestadoAUsuario(prestadoAUsuario);
    }
    //Setters
    public void setFechaDeDevolucion(int fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public void setFechaDelPrestamo(int fechaDelPrestamo) {
        this.fechaDelPrestamo = fechaDelPrestamo;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setPrestadoAUsuario(Usuario prestadoAUsuario) {
        this.prestadoAUsuario = prestadoAUsuario;
    }
    //Getters

    public int getFechaDeDevolucion() {
        return this.fechaDeDevolucion;
    }

    public int getFechaDelPrestamo() {
        return this.fechaDelPrestamo;
    }

    public Libro getLibro() {
        return this.libro;
    }

    public Usuario getPrestadoAUsuario() {
        return this.prestadoAUsuario;
    }
}
