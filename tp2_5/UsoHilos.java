package tp2_5;

public class UsoHilos {

	    public static void main(String[] args) { 
	        System.out.println("Hilo principal iniciando."); 
	 // preguntar a profe si se equivocaron unHilo MiHilo
	        //Primero, construye un objeto unHilo. 
	        MiHilo mh=new MiHilo("#1"); 
	 
	        //Luego, construye un hilo de ese objeto. 
	        Thread nuevoHilo=new Thread(mh); 
	 
	        //Finalmente, comienza la ejecución del hilo. 
	        nuevoHilo.start(); 
	 
	        for (int i=0; i<50;i++){ 
	            System.out.print(" ."); 
	        }try{ 
	            Thread.sleep(100); 
	        }catch (InterruptedException exc){ 
	            System.out.println("Hilo principal interrumpido."); 
	        } 
	        System.out.println("Hilo principal finalizado."); 
}
}


/*a. ¿Qué pasaría si quitamos el sleep()?¿Cuál sería la salida del programa? 
Si quito el sleep main termina super rapido
b. El main() ¿siempre termina al final, o puede suceder que termine antes que 
el run()? ¿Por qué puede suceder esto? la mayor de las veces termina antes, concurrencia pura
c. Realizar los cambios necesarios para implementar extendiendo la clase 
Thread. NO usar la interfaz Runnable. 
d. Realice el ejercicio para que en vez de ejecutar un solo hilo, ejecute 3. 
Realice el procedimiento varias veces. ¿Qué ocurre? ¿Se ejecutan en orden? */