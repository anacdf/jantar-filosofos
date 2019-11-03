package jantar;

import jantar.enums.EstadoGarfo;

import java.util.concurrent.Semaphore;

public class Garfo {
    private EstadoGarfo estadoGarfo;
    private Semaphore semaforo;

    public Garfo() {
        this.estadoGarfo = EstadoGarfo.LIVRE;
        this.semaforo = new Semaphore(1);
    }

    public EstadoGarfo getEstadoGarfo() {
        return estadoGarfo;
    }

    public void setEstadoGarfo(EstadoGarfo estadoGarfo) {
        this.estadoGarfo = estadoGarfo;
    }

    public Semaphore getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(Semaphore semaforo) {
        this.semaforo = semaforo;
    }
}
