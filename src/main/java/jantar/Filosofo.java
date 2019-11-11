package jantar;

import static java.lang.Thread.sleep;

import java.util.Random;

public class Filosofo implements Runnable {
	private Random random = new Random();
    private Garfo garfoEsquerdo;
    private Garfo garfoDireito;
    private String nome;
    private int pensou;
    private int comeu;
    private int tentou;
    private Resultado resultado;

    public Filosofo(Garfo garfoEsquerdo, Garfo garfoDireito, String nome, Resultado resultado) {
        this.garfoEsquerdo = garfoEsquerdo;
        this.garfoDireito = garfoDireito;
        this.nome = nome;
        this.resultado = resultado;

        pensou = 0;
        comeu = 0;
        tentou = 0;
    }

    public void run() {
        long inicio = System.currentTimeMillis();
        long fim;

        while (true) {
            try {
                System.out.println(nome + " pensando");
                pensou += 1;
                resultado.setPensou(pensou);
                sleep(5000);

                if (garfoDireito.pegar()) {
                    System.out.println(nome + " pegou garfo direito");
                    if (garfoEsquerdo.pegar()) {
                        System.out.println(nome + " pegou garfo esquerdo");
                        try {
                            System.out.println(nome + " comendo");
                            comeu += 1;
                            resultado.setComeu(comeu);
                            sleep(2000); // eating;
                        } catch (InterruptedException ex) {
                        }
                        garfoDireito.soltar();
                        System.out.println(nome + " soltou garfo direito");
                        garfoEsquerdo.soltar();
                        System.out.println(nome + " soltou garfo esquerdo");
                    } else {
                        System.out.println(nome + " soltou garfo direito");
                        garfoDireito.soltar();
                        System.out.println(nome + " tentou comer");
                        tentou++;
                        resultado.setTentou(tentou);
                        Thread.sleep(random.nextInt(4) * 1000);
                    }
                } else {
                    System.out.println(nome + " tentou comer");
                    tentou++;
                    resultado.setTentou(tentou);
                    Thread.sleep(random.nextInt(4) * 1000);
                }

            } catch (InterruptedException ex) {
            }

            fim = System.currentTimeMillis();
            if ((fim - inicio) > (resultado.getTempoJantar() * 1000)) {
                System.out.println(resultado.toString());
                break;
            }
        }
    }

}
