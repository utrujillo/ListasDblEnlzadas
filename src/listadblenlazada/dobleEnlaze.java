package listadblenlazada;
import java.util.Scanner;
/**
 * @author Uziel Trujillo
 */
public class dobleEnlaze {
    nodoDblEnlaze primerNodo; //almacena siempre quien es el primer Nodo
    nodoDblEnlaze nodoActual; //almacena el nodo actual
    Scanner sc = new Scanner(System.in);
    
    public dobleEnlaze(){
        //this.primerNodo = null;
        primerNodo  = null;
        nodoActual = null; //inicializo mi nodo actual
    }
    
    public boolean estadoLista(){
       // if(this.primerNodo == null)
        if(primerNodo == null)
            return true;
        else
            return false;
    }
    
    public void addElemento(){
        try{
        
            System.out.println("Ingresar Datos, salir -1");
            int numero = 1;
            
            while(numero > 0){
                numero = sc.nextInt();
                
                if(numero > 0){
                    nodoDblEnlaze nuevoNodo = new nodoDblEnlaze(numero);
                    
                    if(!estadoLista()){
                        //nuevoNodo.setSiguiente(this.primerNodo);
                        nuevoNodo.siguiente = primerNodo;
                        //this.primerNodo.setAnterior(nuevoNodo);
                        primerNodo.anterior = nuevoNodo;
                    }

                    //this.primerNodo = nuevoNodo;
                    primerNodo = nuevoNodo;
                    nodoActual = nuevoNodo;
                    //System.out.println("Elemento Ingresado..");
                }
            }
        }catch(Exception ex){
            System.out.printf("Ha ocurrido un error: ", ex.getCause());
        }
   
        
    }
    
    public void printElemento(){
        //nodoDblEnlaze auxiliar = this.primerNodo;
        nodoDblEnlaze auxiliar = primerNodo;
        
        while(auxiliar != null){
            //System.out.printf("%d ", auxiliar.getDato());
            System.out.printf("%d ", auxiliar.dato);
            //auxiliar = auxiliar.getSiguiente();
            auxiliar = auxiliar.siguiente;
        }
    }
}
