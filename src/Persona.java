import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in);
    String nombre;
    int edad;

    public String setNombre(){
        this.nombre = leer.nextLine();

        return nombre;
    }

    public int setEdad(){
        this.edad = leer.nextInt();

        return edad;
    }

}
