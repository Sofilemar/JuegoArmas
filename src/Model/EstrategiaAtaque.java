package Model;

import java.util.HashMap;

public abstract class EstrategiaAtaque {
//TEMPLATE METHOD
	public void atacar(Luchador atacante,Luchador atacado)
	{
		setArma(atacante);
		atacado.herido(atacante.getArma().getDaño());
	}
	
	public abstract void setArma(Luchador atacante);
	
}
