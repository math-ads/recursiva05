package controller;

public class DivisaoController {

	public DivisaoController() {
		super();
	}
	public double soma(int num) {
		if(num == 1) {
			/*
			 * a condição de parada feita porque a série é executada de tras para frente
			 * terminando quando chega no 1/1
			 */
		return 1;}
		
		return (double) 1/num + soma(num-1);

			
	/* a ordem é inversa para facilitar chegar ao limite
		
		*/
		

	}
	
	}
