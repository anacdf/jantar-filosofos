package jantar;

import java.util.LinkedList;

import jantar.Filosofo;
import jantar.Garfo;

public class Jantar {
	public static void main(String[] args) {
        int nFilosofos = 5;
        int tempoExec = 30000;  // isso seria em millis para uma poss�vel thread sleep

        //fazer ser dinâmico para usar quantos filófos/garfos quiser.

//        Garfo garfo1 = new Garfo(1);
//        Garfo garfo2 = new Garfo(1);
//        Garfo garfo3 = new Garfo(1);
//        Garfo garfo4 = new Garfo(1);
//        Garfo garfo5 = new Garfo(1);
        Thread filosofo = null;
        LinkedList<Garfo> garfos = new LinkedList<Garfo>();
        
        for(int i = 0 ; i < nFilosofos ; i++) {
        	garfos.add(new Garfo(1));
        }
        
        for(int i = 0 ; i < nFilosofos ; i++) {    
        	
        	if(i == nFilosofos-1) {
        		filosofo = new Thread(new Filosofo(garfos.get(i), garfos.get(i-nFilosofos+1), "Filosofo " + i));
        	}else {
        		filosofo = new Thread(new Filosofo(garfos.get(i), garfos.get(i+1), "Filosofo " + i));
        	}
        	
        	filosofo.start();
        }
        
        
        try {
        	Thread.sleep(tempoExec);
			filosofo.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
//        Thread filosofo2 = new Thread(new Filosofo(garfo1, garfo2, "Filosofo 2"));
//        Thread filosofo3 = new Thread(new Filosofo(garfo2, garfo3, "Filosofo 3"));
//        Thread filosofo4 = new Thread(new Filosofo(garfo3, garfo4, "Filosofo 4"));
//        Thread filosofo5 = new Thread(new Filosofo(garfo4, garfo5, "Filosofo 5"));

//        filosofo1.start();
//        filosofo2.start();
//        filosofo3.start();
//        filosofo4.start();
//        filosofo5.start();
			
			
//			System.out.println(filosofo1.toString());
//	        System.out.println(filosofo2.toString());
//	        System.out.println(filosofo3.toString());
//	        System.out.println(filosofo4.toString());
//	        System.out.println(filosofo5.toString());

        
        

        //setar tempo para o jantar terminar e printar os resultados.

        

    }
}
