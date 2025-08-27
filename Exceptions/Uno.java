package Exceptions;

public class Uno {

public static int metodo() {
	
	
	int valor=0;
	
	try {
		
		valor=valor+1;
		 valor=valor + Integer.parseInt("42");
		  valor=valor+1;
		  System.out.print("valor  try 1......"+ valor);
	}catch(NumberFormatException e){
		valor=valor+Integer.parseInt("42");
		System.out.print("el valor del catch es "+valor);
		
		
	}finally {
		
		valor=valor+1;
		System.out.print("valor antes del finally "+valor);
		}
	valor=valor+1;
	System.out.print("valor antes del retur ");
	return valor;
	
                              }



}
