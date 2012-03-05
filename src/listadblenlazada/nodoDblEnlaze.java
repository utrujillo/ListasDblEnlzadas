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
    
    public nodoDblEnlaze(int ind, String name){
        dato = ind;
        nombre = name;
        anterior = null;
        siguiente = null;
    }
    
    /*public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public nodoDblEnlaze getAnterior() {
        return anterior;
    }

    public void setAnterior(nodoDblEnlaze anterior) {
        this.anterior = anterior;
    }

    public nodoDblEnlaze getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(nodoDblEnlaze siguiente) {
        this.siguiente = siguiente;
    }*/
    
    
}
