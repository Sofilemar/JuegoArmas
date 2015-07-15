package Model;

public class EstrategiaCercano extends EstrategiaAtaque{

	public void setArma(Luchador atacante){
		atacante.cambiarArma(TipoArma.CERCANIA);
	}

}
