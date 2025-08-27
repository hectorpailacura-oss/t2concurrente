package Exceptions;

import java.util.Scanner;

public class Tester {
  
	public static void main(String[] args) {
		int edad=-1;
		Scanner scanner = new Scanner(System.in);
		String fecha;
	   PruebaException es=new PruebaException();
	    System.out.println("ingresa una fecha del modo dd-mm-yyyy");
	  fecha= scanner.nextLine();
      scanner.close();
     // edad= es.edadAceptada(fecha);
      try {  edad= es.edadAceptada(fecha);
	 }catch  (ErrorTp e) {
		 
		 System.out.print("hola papis");
	System.out.print(e.getMessage());
	 
	 }


	

}}
	

