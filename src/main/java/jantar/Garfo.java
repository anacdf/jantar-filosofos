package jantar;

import jantar.enums.EstadoGarfo;

import java.util.concurrent.Semaphore;

public class Garfo {
    private EstadoGarfo estadoGarfo;
    private Semaphore semaforo;

    public Garfo(int permits) {
        this.estadoGarfo = EstadoGarfo.LIVRE;
        this.semaforo = new Semaphore(permits);
    }

    public void pegar() {
        //aquire
    }

    public void soltar() {
        //release
    }

}
