package jantar;


public class Filosofo implements Runnable {
    private Garfo garfoEsquerdo;
    private Garfo garfoDireito;
    private String nome;

    public Filosofo(Garfo garfoEsquerdo, Garfo garfoDireito, String nome) {
        this.garfoEsquerdo = garfoEsquerdo;
        this.garfoDireito = garfoDireito;
        this.nome = nome;
    }

    //estado = pensando;

    public void run() {
        //pega o garfo pra comer
        while (true) {
            try {
                garfoEsquerdo.pegar(); //pegar garfo

                System.out.println(nome + "pegou Garfo Esquerdo");

                //estado = comendo

                Thread.sleep(1000);

                garfoDireito.soltar();

                //estado = pensando, solta os garfos. espera 2 seg
                //estado = com fome: qnd só consegue pegar 1 garfo;

            } catch (InterruptedException e) {

            }
        }
    }

    public void start() {

    }
}
