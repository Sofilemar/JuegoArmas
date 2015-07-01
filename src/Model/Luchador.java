package Model;

import java.util.HashMap;
import java.util.Random;

public abstract class Luchador {

	protected Arma arma;
	protected Armadura arm;
	protected EstrategiaAtaque ea;
	protected FabLuchador fb;
	protected int vida;
	private HashMap <Objetivo, EstrategiaAtaque> ataque;
	
	public Luchador(FabLuchador fb) {
		super();
		this.fb=fb;
		this.vida=100;
	}
	
	protected abstract void setear();
	
	public Objetivo visualizarObjetivo()
	{
		Random md= new Random();
		int valorDado=md.nextInt(11);
		if(valorDado<5)
		{
			return Objetivo.CERCANO;
		}else
		{
			return Objetivo.DISTANTE;
		}
	}
	public EstrategiaAtaque cambiarEstrategia(Objetivo obj, HashMap ataque)
	{
		switch(obj)
		{
			case CERCANO:
				ea=(EstrategiaAtaque) ataque.get(obj);
				break;
			
			case DISTANTE:
				ea=(EstrategiaAtaque) ataque.get(obj);
				break;
		}
		return ea;
	}
	public void ejecutarAtaque(Luchador l2) 
	{
		ataque = new HashMap <Objetivo,EstrategiaAtaque> ();
		ataque.put(Objetivo.CERCANO,  new EstrategiaCercano());
		ataque.put(Objetivo.DISTANTE, new EstrategiaDistante());
		
		Objetivo obj;
		obj=this.visualizarObjetivo();
		this.cambiarEstrategia(obj,ataque);
		ea.recargar();
		ea.atacar(l2);
	}
}
