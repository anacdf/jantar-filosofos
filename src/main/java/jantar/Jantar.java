package jantar;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Jantar {
    public static void main(String[] args) {
        int nFilosofos = 5;

        Garfo garfo1 = new Garfo(1);
        Garfo garfo2 = new Garfo(1);
        Garfo garfo3 = new Garfo(1);
        Garfo garfo4 = new Garfo(1);
        Garfo garfo5 = new Garfo(1);

        Filosofo filosofo1 = new Filosofo(garfo1, garfo5, "Filosofo1");
        Filosofo filosofo2 = new Filosofo(garfo1, garfo2, "Filosofo2");
        Filosofo filosofo3 = new Filosofo(garfo2, garfo3, "Filosofo3");
        Filosofo filosofo4 = new Filosofo(garfo3, garfo4, "Filosofo4");
        Filosofo filosofo5 = new Filosofo(garfo4, garfo5, "Filosofo5");

    }
}
