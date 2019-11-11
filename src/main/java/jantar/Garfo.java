package jantar;

import java.util.concurrent.Semaphore;

public class Garfo {
    private Semaphore semaforo;

    public Garfo(int permits) {
        this.semaforo = new Semaphore(permits);
    }

    public boolean pegar() {
        return semaforo.tryAcquire();
    }

    public void soltar() {
        semaforo.release();
    }
}
