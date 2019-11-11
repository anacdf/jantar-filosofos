package jantar;

public class Resultado {
    private String nome;
    private int pensou;
    private int comeu;
    private int tentou;
    private long tempoJantar;

    public Resultado(String nome, long tempoJantar) {
        this.nome = nome;
        this.tempoJantar = tempoJantar;
    }

    public void setPensou(int pensou) {
        this.pensou += pensou;
    }

    public void setComeu(int comeu) {
        this.comeu += comeu;
    }

    public void setTentou(int tentou) {
        this.tentou = +tentou;
    }

    public long getTempoJantar() {
        return tempoJantar;
    }

    public String toString() {
        return nome + " pensou: " + pensou + " vezes, comeu " + comeu + " vezes e tentou comer " + tentou + " vezes.";
    }
}
