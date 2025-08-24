package tp2_5_c_d;

public class MiHilo1 extends Thread{

MiHilo1(String nombre){
	
	super(nombre);
	
}
public void run(){ 
    System.out.println("Comenzando "+Thread.currentThread().getName()); 
    try { 
        for (int contar=0; contar<10; contar++){ 
            Thread.sleep(400); 
            System.out.println("En "+Thread.currentThread().getName()+", el recuento "+contar); 
        }
           // System.out.println("mi nombre real es "+ Thread.currentThread().getName()); } 
    }catch (InterruptedException exc){ 
        System.out.println(Thread.currentThread().getName()+ "Interrumpido."); 
    } 
    System.out.println("Terminando "+Thread.currentThread().getName()); 
} 
} 


