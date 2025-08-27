import java.util.HashSet;

public class Usuario {
    //Atributos
    private String nombre, apellido;
    private int dni;

    //Constructor
    public Usuario(String nombre, String apellido, int dni) {
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
    }
    //Setters
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new DatoIncorrecto("El nombre no puede ser nulo o estar en blanco");
        }
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        if (apellido == null || apellido.isBlank()) {
            throw new DatoIncorrecto("El apellido no puede ser nulo o estar en blanco");
        }
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        if (dni <= 0 || dni >= 100000000) {
            throw new DatoIncorrecto("El dni que insertaste no puede ser un numero negativo o excederse del limite de rango(10)");
        }
        this.dni = dni;
    }
    //GETTERS

    public String getNombre() {
        return this.nombre;
    }
    public String getApellido(){return this.apellido;}
    public int getDni(){return this.dni;}

}
