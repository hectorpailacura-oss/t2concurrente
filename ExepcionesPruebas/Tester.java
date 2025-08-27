package ExepcionesPruebas;

public class Tester {

	public static void main(String[] args) {
	Calculadora calcu=new Calculadora();
    try {calcu.dividir(10, 0);
    }catch(RuntimeException e) {
    	
    	System.out.print("holaaaaaaaaaaaa");
    }
	
	
	}

}
