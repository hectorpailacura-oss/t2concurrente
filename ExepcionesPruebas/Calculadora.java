package ExepcionesPruebas;

public class Calculadora {

public int dividir(int dividendo, int divisor) throws NuevaException{
	int resultado;
	if(divisor ==0) {
		throw new NuevaException("Error!!!!!!!");  
		
	}else {
   resultado= (dividendo /divisor);
   return resultado;}
	
	
}

}
