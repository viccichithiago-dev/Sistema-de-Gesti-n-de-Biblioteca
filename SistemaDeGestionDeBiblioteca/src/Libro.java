public class Libro {
    //Atributos
    private String autor,nombre,reseña,genero;
    private boolean disponibilidad = true;
    //Constructor
    public Libro(String autor,String nombre,String reseña,String genero){
        setAutor(autor);
        setNombre(nombre);
        setReseña(reseña);
        setGenero(genero);
    }
    //setters

    private void setAutor(String autor) {
        if(autor== null || autor.isBlank()){
            throw new DatoIncorrecto("El libro no puede no tener asignado un author");
        }
        this.autor = autor;
    }
    private void setNombre(String nombre) {
        if(nombre== null || nombre.isBlank()){
            throw new DatoIncorrecto("El libro no puede no tener asignado un nombre");
        }
        this.nombre = nombre;
    }
    public void setReseña(String reseña) {
        if(reseña== null || reseña.isBlank()){
            throw new DatoIncorrecto("El libro no puede no tener asignada una reseña");
        }
        this.reseña = reseña;
    }
    public void setGenero(String genero) {
        if(genero== null || genero.isBlank()){
            throw new DatoIncorrecto("El libro no puede no tener asignado un genero");
        }
        this.genero = genero;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    //getters

    public String getAutor() {
        return this.autor;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getReseña(){
        return this.reseña;
    }
    public String getGenero(){
        return this.genero;
    }

    public boolean isDisponibilidad() {
        return this.disponibilidad;
    }
}
