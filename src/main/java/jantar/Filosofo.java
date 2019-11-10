package jantar;


import static java.lang.Thread.sleep;

public class Filosofo implements Runnable {
    private Garfo garfoEsquerdo;
    private Garfo garfoDireito;
    private String nome;
    private int pensou;
    private int comeu;
    private int tentou;

    public Filosofo(Garfo garfoEsquerdo, Garfo garfoDireito, String nome) {
        this.garfoEsquerdo = garfoEsquerdo;
        this.garfoDireito = garfoDireito;
        this.nome = nome;

        pensou = 0;
        comeu = 0;
        tentou = 0;
    }

    //estado = pensando;

    public void run() {
        while (true) {
            try {
                System.out.println(nome + " pensando");
                pensou+= 1;
                sleep(1000);
            } catch (InterruptedException ex) {
            }
            while (true) {
                comer();
            }
        }
    }

    private void comer() {
        if (garfoDireito.pegar()) {
            System.out.println(nome + " pegou garfo direito");
            if (garfoEsquerdo.pegar()) {
                System.out.println(nome + " pegou garfo esquerdo");
                try {
                    System.out.println(nome + " comendo");
                    comeu += 1;
                    sleep(2000); // eating;
                } catch (InterruptedException ex) {
                }
                garfoDireito.soltar();
                System.out.println(nome + " soltou garfo direito");
                garfoEsquerdo.soltar();
                System.out.println(nome + " soltou garfo esquerdo");
            } else {
                System.out.println(nome + " soltou garfo esquerdo");
                garfoEsquerdo.soltar();
            }
        }
    }

    public String toString() {
        return nome + " pensou: " + pensou + " vezes, comeu " + comeu + " vezes e tentou comer " + tentou + " vezes.";
    }
}
