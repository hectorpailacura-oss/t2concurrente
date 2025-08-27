package tp2_6;

public class Winner2 {
int distancia;
String nombre;

public Winner2() {
	distancia=0;
	nombre="";
	
	}

public synchronized int getDistancia(){
   return distancia;
}

  
     public synchronized void setDistancia(int valor){
    distancia= valor;
}
public synchronized String getNombre() {
	
	return this.nombre;
	
}

 public synchronized void setNombre(String nombre) {
	 this.nombre=nombre;
	 
 }



}
