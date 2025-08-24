package tp2_1;

public class testeoRecurso {

	
		public  static void main (String[] args){ 
			Cliente juan=new Cliente(); 
			juan.setName("Juan Lopez"); 
			Cliente ines=new Cliente (); 
			ines.setName ("Ines Garcia"); 
			
			ines.start(); juan.start(); 
			
		  //ines.start();  Recurso.uso();
		/*	a. Analice el funcionamiento del siguiente código. ¿Cuántos hilos de control 
			participan en la ejecución? 
			b. ¿Cúal es la funcionalidad del método “uso” de Recurso? 
			c. Indique una salida posible.  
			d. ¿Qué sucede si agrega la línea  “Recurso.uso()” al final del main? 
			e. ¿Qué sucede si cambia el orden de las instrucciones “start()”? *
			
			a) sin incluir main 2;
			b) La funcionalidad del metodo uso es imprimir por pantalla el nombre del hilo que se esta ejecu
			  tando en el momento. Deja evidenciar el cambio de hilos dado que una linia atras se imprime
			  el nombre del hilo, si varia la  la ejecucion de un hilo en ese momento se veria por pantalla 
			  facilemente.
			  d) aparece el nombre de main tambien.
			  e)mantiene la misma funcionalidad.
			
			
			
			
			
			
			
			*/
	}

}
