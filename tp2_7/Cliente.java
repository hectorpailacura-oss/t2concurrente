package tp2_7;

public class Cliente { 
private String nombre; 
private int[] carroCompra; 
  
Cliente (String nom, int [] carrito){
this.nombre=nom;
this.carroCompra=carrito;


} 
public String getNombre() {
	
	
	return this.nombre;
}

public int[] getCarroCompra() {
	
	return this.carroCompra;
	
}

}