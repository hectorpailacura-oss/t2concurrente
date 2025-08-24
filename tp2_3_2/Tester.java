package tp2_3_2;

public class Tester {

	public static void main(String[] args) {
	HiloRun RunJose=new HiloRun();
	HiloRun RunMaria=new HiloRun();
		
		
		Thread HiloJose=new Thread(RunJose,"jose");
	Thread  Hilomaria=new Thread(RunMaria,"maria");
	
   Hilomaria.start();
   HiloJose.start();
	}

}


/*4. La interfaz Runnable proporciona un método alternativo a la utilización de la clase Thread, implemente el ejercicio anterior utilizando la interfaz Runnable. 
a. ¿Qué sucede? ¿Es necesario el constructor? */
