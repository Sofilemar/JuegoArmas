package Gui;

import Model.*;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("Creando FabricaGladiador...");
		System.out.println("Seteando luchador...");
		
		Handler hl =new Handler();
		Luchador l1 = hl.crearLuchador(Utils.GLADIADOR);		
		if (l1 !=null)
		{
			System.out.println("Gladiador creado.");
		}
		
		System.out.println("Creando FabricaArquero...");
		System.out.println("Seteando luchador...");
		
		Handler h2 = new Handler();
		Luchador l2 = h2.crearLuchador(Utils.ARQUERO);
		if (l2 !=null)
		{
			System.out.println("Arquero creado.");
		}
		
		//l1.ejecutarAtaque(l1,l2);
		
		System.out.println("Atacando con "+l1.toString()+ " Russell Crowe usando arma "+l1.getArma());
		while (l2.estaVivo()==true)
		{
			System.out.println("El "+l2.toString()+" esta herido. Vida "+l2.getVida());
			l1.ejecutarAtaque(l1,l2);
		}
		System.out.println("El "+l2.toString()+" ha muerto.");
		//l2.ejecutarAtaque(l2,l1);
	}
	
}
