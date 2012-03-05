package listadblenlazada;
/**
 * @author Uziel Trujillo
 */
public class nodoDblEnlaze {
    public int dato;
    public String nombre;
    public nodoDblEnlaze anterior;
    public nodoDblEnlaze siguiente;
    
    public nodoDblEnlaze(int d){
        dato = d;
        anterior = null;
        siguiente = null;
    }    
}
