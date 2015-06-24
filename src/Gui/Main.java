package Gui;

import Model.*;


public class Main {

	public static void main(String[] args) {
		Handler hl =new Handler();
		hl.crearLuchador(Utils.GLADIADOR);
		
		Handler h2 = new Handler();
		h2.crearLuchador(Utils.ARQUERO);
	}

}
