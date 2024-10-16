import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);
        int tamanio;
        int edad;
        String nombre;
        MetodoOrdenamiento mO = new MetodoOrdenamiento();

        System.out.print("Ingrese la cantidad de personas que desea ingresar: ");
        tamanio = leer.nextInt();
        leer.nextLine();
        Persona1[] personas = new Persona1[tamanio];


        for (int i = 0; i < tamanio; i++){
            System.out.println("Ingrese el nombre de la persona: ");
            nombre = leer.nextLine();
            edad = validacion(leer, "Ingrese la edad de la persona: ", false);
            leer.nextLine();
            personas[i] = new Persona1(nombre,edad);

        }

        System.out.println("El arreglo de las edades es: " + java.util.Arrays.toString(personas));
        mO.sortBubbleAdv(personas);
        System.out.println("El arreglo ordenado de las edades es: " + java.util.Arrays.toString(personas));

        int edadBuscar = validacion(leer, "Ingrese la edad a buscar: ", false);

        int posicion = mO.busquedaBinaria(personas, edadBuscar);

        while (posicion == -1){
            System.out.println("La edad ingresada no existe :/");
            edadBuscar = validacion(leer, "Ingrese la edad a buscar: ", false);
            posicion = mO.busquedaBinaria(personas, edadBuscar);
        }

        for (int i = 0; i < tamanio; i++){
            System.out.println(personas[i] + " | ");
        }


        System.out.println("La edad a buscar esta relacionada con el nombre: ");
        System.out.println(personas[posicion]);

    }

    public static int validacion(Scanner leer, String mensaje, boolean permitirNegativos){
            
        int arrayLength = 0;

        do{
            System.out.print(mensaje);
            while (!leer.hasNextInt()) {
                System.out.println("Debes ingresar un entero valido :/");
                System.out.print(mensaje);
                leer.next();
            }
            arrayLength = leer.nextInt();
            if (!permitirNegativos && arrayLength <= 0){
                System.out.println("El tamaño debe ser entero positivo mayor a 0 :/");
            }
        } while(! permitirNegativos && arrayLength <= 0);
        return arrayLength;
    
}


}

