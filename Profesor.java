/*
Clase profesor
 */
public class Profesor {
    /*
    Atributos
     */
    String nombre;
    String Accion;
    /**
     * Constructor de la clase
     * @param nombre Nombre del animal
     * @param Accion Accion que hace el Profesor
     *
     * Complejidad temporal: O(1) Complejidad Constante
     */
    Profesor(String nombre, String Accion){
        this.nombre=nombre;
        this.Accion=Accion;

    }

    /**
     * Metodo imprime la accion que hace el profesor
     * Complejidad temporal O(1) complejidad constante
     */
    void hacerAccion(){
        System.out.println("El Profesor "+nombre+" esta "+Accion);
    }

}
