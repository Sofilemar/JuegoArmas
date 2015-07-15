package Model;

public class EstrategiaDistante extends EstrategiaAtaque{

	public void setArma(Luchador atacante){
		atacante.cambiarArma(TipoArma.DISTANCIA);
	}
}
