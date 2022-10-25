public class Ejercicio8 {

    public static void main (String[] args) {
        Persona persona = new Persona();

        persona.setEdad(27);
        persona.setNombre("Juan");
        persona.setTelefono(668868645);

        System.out.println("Mi edad es: " + persona.getEdad());
        System.out.println("Me llamo: " + persona.getNombre());
        System.out.println("El numero de telefono es: " + persona.getTelefono());
    }

}
class Persona {
    //VARIABLES PRIVADAS
    private int edad;
    private String nombre;
    private int telefono;
    //SETTERS
    public void setEdad (int edad) {
        this.edad = edad;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }
    //GETTERS
    public int getEdad () {
        return this.edad;
    }
    public String getNombre () {
        return this.nombre;
    }
    public int getTelefono () {
        return this.telefono;
    }

}