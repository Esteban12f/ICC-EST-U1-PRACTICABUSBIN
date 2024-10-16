import java.util.Arrays;

public class MetodoOrdenamiento {

    public Persona1 [] sortBubbleAdv(Persona1[] arreglo){

        int n = arreglo.length;
        boolean intercambio = false;

        for (int i = 0; i < n; i++){
            intercambio = false;
            for (int j = 0; j < n-1-i; j++){
                
                if (arreglo[j].getEdad() > arreglo[j + 1].getEdad()){
                    //Intrecambio 
                    Persona1 aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio = true;
                }
            }
                    //Si no hubo intercambio
                if (!intercambio){
                        break;
                }
        }
    return arreglo;
    }

    public int busquedaBinaria(Persona1[] arreglo, int valorBuscar){
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            System.out.println("bajo = " + inicio + " alto = " + fin + " medio = " + medio);
            if (arreglo[medio].getEdad() == valorBuscar){
                System.out.println("Se encontro la edad solicitada");
                // Elemento encontrado
                return medio;
            }
            
            if (arreglo[medio].getEdad() < valorBuscar){
                System.out.println("El arreglo va hacia la derecha");
                inicio = medio + 1;
            } else {
                System.out.println("El arreglo va hacia la izquierda");
                fin = medio - 1;
            }
        }

        return -1;

    }
}

