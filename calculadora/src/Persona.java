public class Persona {
    private int edad;
    private String nombre;
    private String provincia;

    public Persona(int edad, String nombre, String provincia) {
        this.edad = edad;
        this.nombre = nombre;
        this.provincia = provincia;
    }

    // Getters and setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
