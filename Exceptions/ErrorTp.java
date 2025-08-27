package Exceptions;

import java.time.format.DateTimeParseException;

public class ErrorTp extends DateTimeParseException{

	ErrorTp(String fecha){
		
		super( "Formato de fecha inválido", fecha,1);
		
	}
	
}
