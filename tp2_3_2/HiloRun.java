package tp2_3_2;

public class HiloRun implements Runnable{

/*	private String nombre;
	
	
	public HiloRun (String nombre) {
		this.nombre=nombre;
	}
	
	public String getName() {
		
		return this.nombre;
	}
	
	
	*/
	
	
	public void run() {
		 
			   for (int i = 0; i < 10 ; i++)  
			    System.out.println(i + " " + Thread.currentThread().getName() );  
			   System.out.println("Termina thread " + Thread.currentThread().getName() );
		
	}

}
