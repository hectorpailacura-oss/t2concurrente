package tp2_6;

import java.util.Random;

public class Corredor implements Runnable {
String nombre;
Random random ;
 int distancia;
	Corredor(String nombre){
		this.nombre=nombre;
		this.distancia=0;
		random = new Random();
		
	}
	public void run() {
		for(int i=0; i<10;i++) {
			
			this.distancia= distancia + (random.nextInt(100) + 1);
			System.out.println("mi nombre es  " + this.nombre + "  mi destancia es " + this.distancia);
			  try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
	public int getDistancia() {
		
		return this.distancia;
		
	}	
		
		public String getNombres() {
			
			return this.nombre;
			
		}
		
		
		
	

}
/*6. Simulación de Carrera Multithread: 
Imagina que estás organizando una carrera de atletismo con varios corredores. 
Quieres simular esta carrera utilizando múltiples hilos en Java. Cada corredor será 
representado por un hilo independiente que avanzará en la pista de carreras. 
Crea una clase llamada Corredor cuyas instancias serán utilizadas por los hilos 
(utilizar interfaz Runnable). Dentro de esta clase, define los atributos necesarios 
como el nombre del corredor y la distancia recorrida. Cada corredor sabe la distancia 
que recorrió, por lo que deberá imprimir su nombre y el avance (aleatorio entre 1 y 
10), por cada paso que realiza. Entre cada paso realizado descansa. Una vez que 
haga 100 pasos, el corredor habrá terminado. 
En la clase principal, crea un arreglo de “ Corredores” y un hilo para cada corredor 
en el arreglo. 
Inicia todos los hilos creados usando el método start(). Utiliza Thread.sleep() dentro 
del método run() de cada corredor para simular el tiempo entre pasos. 
Al finalizar la carrera se desea saber qué corredor hizo la mayor distancia y cual fue 
esa distancia. ¿Quién será el encargado de mostrar este mensaje? ¿Cómo hará 
para esperar que todo los corredores terminen la carrera? */