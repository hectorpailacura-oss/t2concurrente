package tp2_6;

public class Carrera {

	public static void main(String[] args) {
	Thread [] hilos = new Thread[3];
	Corredor [] corredores=new Corredor[3];
     int i;
	
    Winner2 resultado=new Winner2();
    Winner ganador=new Winner(corredores,resultado);
    Corredor corredor;
     
     for ( i=0; i < corredores.length;i++) {
		
	
		
		Corredor run =new Corredor(" corredor "+i);
		corredores[i]=run;
		hilos[i]=new Thread(run) ;
	     hilos[i].start();
		
		
	}
	
	while(i>0) {
		
		try {
			hilos[i-1].join();
			i--;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	System.out.println("............................................");
	
	ganador.winner();
	
	System.out.println("la carrera termino.............................................");
	
	System.out.println("El ganador es .............."+ resultado.nombre+"........."+ resultado.distancia);
	
	}

}
