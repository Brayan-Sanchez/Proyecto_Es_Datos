import java.util.ArrayList;
import java.util.Scanner;

class NodoDecision {
    private String descripcion;
    private int riesgo;
    private ArrayList<NodoDecision> opciones;

    public NodoDecision(String descripcion, int riesgo) {
        this.descripcion = descripcion;
        this.riesgo = riesgo;
        this.opciones = new ArrayList<>();
    }

    public void agregarOpcion(NodoDecision opcion) {
        opciones.add(opcion);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public ArrayList<NodoDecision> getOpciones() {
        return opciones;
    }
}