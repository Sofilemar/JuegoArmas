package Model;

import java.util.HashMap;

public class Gladiador extends Luchador {

	
	public Gladiador(FabLuchador fl) {
		super(fl);
		setear();
	}

	@Override
	protected void setear() {
		armasDisponibles.put(TipoArma.CERCANIA, fb.ponerArmaCercana());
		armasDisponibles.put(TipoArma.DISTANCIA, fb.ponerArmaLejana());
		this.arma= armasDisponibles.get(TipoArma.CERCANIA);
		this.arm= fb.ponerArmadura();
	}

	@Override
	public void cambiarArma(TipoArma obj) {
		this.arma=armasDisponibles.get(obj);	
	}

	public String toString()
	{
		return "Gladiador" ;
	}
}
