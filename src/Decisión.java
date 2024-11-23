public class Decisión {
    private String texto;
    private int riesgo;

    public Decisión(String texto, int riesgo) {
        this.texto = texto;
        this.riesgo = riesgo;
    }

    public String getTexto() {
        return texto;
    }

    public int getRiesgo() {
        return riesgo;
    }
}
