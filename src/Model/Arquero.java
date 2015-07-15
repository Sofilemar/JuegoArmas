package Model;

import java.util.HashMap;

public class Arquero extends Luchador{

	public Arquero(FabLuchador fb) {
		super(fb);
		setear();
	}

	@Override
	protected void setear() {
		armasDisponibles.put(TipoArma.CERCANIA, fb.ponerArmaCercana());
		armasDisponibles.put(TipoArma.DISTANCIA, fb.ponerArmaLejana());
		
		this.arma= armasDisponibles.get(Objetivo.CERCANO);
		this.arm= fb.ponerArmadura();
	}

	@Override
	public void cambiarArma(TipoArma obj) {
		this.arma=armasDisponibles.get(obj);	
	}

	public String toString()
	{
		return "Arquero" ;
	}
}
