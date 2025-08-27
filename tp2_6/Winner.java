package tp2_6;

public class Winner {
	Corredor [] mi;
Winner2 m;
	
Winner(Corredor[] corredores,Winner2 m) {
	this.m=m;
	mi=corredores;
	
	
	
}
public void  winner() {
	int cantididad=mi.length;
	//Corredor ganador=mi[0];
	for(int i=0;i< mi.length;i++) {
		System.out.println(i);
		 mi[i].gane(this.m);
		
		}
	
	
	
}

}
