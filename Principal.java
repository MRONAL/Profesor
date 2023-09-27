/**
 * Primera clase que se ejecuta
 */
public class Principal {
    /**
     * Primer metodo que se ejecuta en mi aplicacion
     * @param args
     * Complejidad temporal: O(1) Complejidad constante
     */
    public static void main(String[] args) {
        Profesor Daniel= new Profesor("Daniel","dictando clase");
        Profesor Vivas= new Profesor("Diego","regañando a los estudiantes ");
        Profesor Jaime= new Profesor("Jaime","subiendo las notas");
        Daniel.hacerAccion();
        Vivas.hacerAccion();
        Jaime.hacerAccion();
    }
}
