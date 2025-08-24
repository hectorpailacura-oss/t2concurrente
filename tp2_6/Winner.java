package tp2_6;

public class Winner {
	Corredor [] mi;
Winner(Corredor[] corredores) {
	
	mi=corredores;
	
	
	
}
public Corredor winner() {
	int cantididad=mi.length;
	Corredor ganador=mi[0];
	for(int i=1;i< mi.length;i++) {
		
		if(ganador.getDistancia()<mi[i].getDistancia()) {
			ganador=mi[i];
			}
		
		}
	
	return ganador;
	
}

}
