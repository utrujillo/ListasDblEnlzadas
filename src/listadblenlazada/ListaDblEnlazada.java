package listadblenlazada;
import java.util.Scanner;
/**
 * @author Uziel Trujillo
 */
public class ListaDblEnlazada {

    public static void main(String[] args) {
       dobleEnlaze lde = new dobleEnlaze();
       Scanner sc = new Scanner(System.in);
       
       /*lde.addElemento();
       lde.printElemento();*/
       
       //Ingresamos los valores de la lista
       lde.addNombre();
       System.out.println("\nValores de la Lista");
       lde.printNombre();
       
       //Mostramos el Menu y guardamos la opcion seleccionada
       lde.menu();
       int opcionMenu = sc.nextInt();
       
       //Mientras la opcion no sea 0 => salir
       while(opcionMenu != 0){
            
           //ejecutamos la opcion seleccionada
            switch(opcionMenu){
                case 1: { lde.nextNombre(); }; break; //Mover Adelante
                case 2: { lde.backNombre(); }; break; //Mover Atras
                case 3: { /*buscar Elemento*/ }; break; //Tarea UAA
            }
            
           //Nuevamente el menu y obtenemos la opcion
            lde.menu();
            opcionMenu = sc.nextInt();
       }//fin del while
    }
}
