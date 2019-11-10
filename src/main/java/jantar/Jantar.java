package jantar;

import jantar.Filosofo;
import jantar.Garfo;

public class Jantar {
    public static void main(String[] args) {
        int nFilosofos = 5;

        //fazer ser dinâmico para usar quantos filófos/garfos quiser.

        Garfo garfo1 = new Garfo(1);
        Garfo garfo2 = new Garfo(1);
        Garfo garfo3 = new Garfo(1);
        Garfo garfo4 = new Garfo(1);
        Garfo garfo5 = new Garfo(1);

        Thread filosofo1 = new Thread(new Filosofo(garfo1, garfo5, "Filosofo1"));
        Thread filosofo2 = new Thread(new Filosofo(garfo1, garfo2, "Filosofo2"));
        Thread filosofo3 = new Thread(new Filosofo(garfo2, garfo3, "Filosofo3"));
        Thread filosofo4 = new Thread(new Filosofo(garfo3, garfo4, "Filosofo4"));
        Thread filosofo5 = new Thread(new Filosofo(garfo4, garfo5, "Filosofo5"));

        filosofo1.start();
        filosofo2.start();
        filosofo3.start();
        filosofo4.start();
        filosofo5.start();

        //setar tempo para o jantar terminar e printar os resultados.

        System.out.println(filosofo1.toString());
        System.out.println(filosofo2.toString());
        System.out.println(filosofo3.toString());
        System.out.println(filosofo4.toString());
        System.out.println(filosofo5.toString());

    }
}
