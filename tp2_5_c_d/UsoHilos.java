package tp2_5_c_d;

import tp2_5.MiHilo;

public class UsoHilos {

	public static void main(String[] args) {
        System.out.println("Hilo principal iniciando."); 
	
	        MiHilo1 nuevoHilo =new MiHilo1("choclo"); 
	        MiHilo1 nuevoHilo1 =new MiHilo1("tomatellllllllllllllllllll"); 
	        MiHilo1 nuevoHilo2 =new MiHilo1("tomate"); 
	        //Finalmente, comienza la ejecución del hilo. 
	        nuevoHilo.start(); 
	        nuevoHilo1.start(); nuevoHilo2.start(); 
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