public class Jugador {
    private int riesgoTotal;

    public Jugador() {
        this.riesgoTotal = 0;
    }

    public int getRiesgoTotal() {
        return riesgoTotal;
    }

    public void incrementarRiesgo(int riesgo) {
        this.riesgoTotal += riesgo;
    }

    public boolean estaVivo() {
        return riesgoTotal < 20;
    }
}
