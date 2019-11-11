package jantar;

import java.util.LinkedList;

public class Jantar {
	public static void main(String[] args) {
        int nFilosofos = 5;
        int tempoExec = 30000;  // isso seria em millis para uma possível thread sleep
		long tempoJantar = 60;

        Thread filosofo = null;
        Resultado resultado = null;
        LinkedList<Garfo> garfos = new LinkedList<Garfo>();

		System.out.println("Tempo de jantar: " + (tempoJantar / 60) + " minutos.");

		for(int i = 0 ; i < nFilosofos ; i++) {
        	garfos.add(new Garfo(1));
        }
        
        for(int i = 0 ; i < nFilosofos ; i++) {
        	if(i == nFilosofos-1) {
        		String nome = "Filosofo " + (i+1);
        		resultado = new Resultado(nome, tempoJantar);
        		filosofo = new Thread(new Filosofo(garfos.get(i), garfos.get(i-nFilosofos+1), nome, resultado));
        	}else {
				String nome = "Filosofo " + (i+1);
				resultado = new Resultado(nome, tempoJantar);
        		filosofo = new Thread(new Filosofo(garfos.get(i), garfos.get(i+1), nome, resultado));
			}
        	filosofo.start();
        }

        try { //nao sei o q isso faix
        	Thread.sleep(tempoExec);
			System.out.println("==> Thread sleep");
			filosofo.interrupt();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}
