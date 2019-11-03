package jantar;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Jantar {
    public static void main(String[] args) {
        List<Filosofo> filosofos = new ArrayList<Filosofo>();
        int nFilosofos = 5;

        for (int i = 0; i < nFilosofos; i++) {
            filosofos.add(new Filosofo(new Semaphore(1), new Semaphore(1), "jantar.Filosofo" + i+1));
        }

        for (Filosofo fil : filosofos) {
            new Thread(fil).start();
        }

    }
}
