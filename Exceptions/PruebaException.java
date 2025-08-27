package Exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ExepcionesPruebas.NuevaException;

public class PruebaException {

String fecha;


	
	
	
	public int edadAceptada(String fecha1)throws ErrorTp{ 
		 LocalDate hoy = LocalDate.now();
		 String fechaTexto = fecha1;
	     int años=-1;
	   
	     if(verificador(fechaTexto)) {
	     DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	      LocalDate fecha = LocalDate.parse(fechaTexto, formato);
          años=hoy.getYear()-fecha.getYear();}else {
        	  
        	  throw new ErrorTp(fechaTexto); 
        	  
          }
	
	        
	       return  años;
	    }


	public boolean verificador(String fechaIngresada) {
		boolean  tester; 
		int longitud= fechaIngresada.length();
		tester=longitud==10;
		return tester;
		
		
	}
		
		
}
		
	
	
	
	
	
	
	
		
	
	
	





