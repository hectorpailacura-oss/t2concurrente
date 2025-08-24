package tp2_5;

public class MiHilo implements Runnable{
    String nombreHilo; 
    
    MiHilo(String nombre){ 
        nombreHilo=nombre; 
    } 
    //Punto de entrada del hilo 
    //Los hilos comienzan a ejecutarse aquí 
    public void run(){ 
        System.out.println("Comenzando "+nombreHilo); 
        try { 
            for (int contar=0; contar<10; contar++){ 
                Thread.sleep(400); 
                System.out.println("En "+nombreHilo+", el recuento "+contar); 
            }
               // System.out.println("mi nombre real es "+ Thread.currentThread().getName()); } 
        }catch (InterruptedException exc){ 
            System.out.println(nombreHilo + "Interrumpido."); 
        } 
        System.out.println("Terminando "+nombreHilo); 
    } 
} 

