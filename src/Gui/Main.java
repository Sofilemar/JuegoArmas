package Gui;

import Model.*;


public class Main {

	public static void main(String[] args) {
		Handler hl =new Handler();
		Luchador l1 = hl.crearLuchador(Utils.GLADIADOR);
		
		Handler h2 = new Handler();
		Luchador l2 = h2.crearLuchador(Utils.ARQUERO);

		l1.ejecutarAtaque(l2);
		l2.ejecutarAtaque(l1);
	}

}
