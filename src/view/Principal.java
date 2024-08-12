package view;

import controller.DivisaoController;
public class Principal {

	public static void main( String[]args) {
		
	
	DivisaoController divCon= new DivisaoController();
	int num = 8;
	double resp= divCon.soma(num);
	System.out.println(resp);
	
}
}