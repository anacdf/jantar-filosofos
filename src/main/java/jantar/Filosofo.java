package jantar;

import java.util.concurrent.Semaphore;

public class Filosofo implements Runnable {
    private int vezesComeu;
    private int vezesPensou;
    private Semaphore garfoEsquerdo;
    private Semaphore garfoDireito;
    private String nome;

    public Filosofo(Semaphore garfoEsquerdo, Semaphore garfoDireito, String nome) {
        this.vezesComeu = 0;
        this.vezesPensou = 0;
        this.garfoEsquerdo = garfoEsquerdo;
        this.garfoDireito = garfoDireito;
        this.nome = nome;
    }

    public int getVezesComeu() {
        return vezesComeu;
    }

    public void setVezesComeu(int vezesComeu) {
        this.vezesComeu = vezesComeu;
    }

    public int getVezesPensou() {
        return vezesPensou;
    }

    public void setVezesPensou(int vezesPensou) {
        this.vezesPensou = vezesPensou;
    }

    public Semaphore getGarfoEsquerdo() {
        return garfoEsquerdo;
    }

    public void setGarfoEsquerdo(Semaphore garfoEsquerdo) {
        this.garfoEsquerdo = garfoEsquerdo;
    }

    public Semaphore getGarfoDireito() {
        return garfoDireito;
    }

    public void setGarfoDireito(Semaphore garfoDireito) {
        this.garfoDireito = garfoDireito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void run() {

    }

    public void start() {

    }
}
