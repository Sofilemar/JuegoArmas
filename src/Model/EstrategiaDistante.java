package Model;

public class EstrategiaDistante implements EstrategiaAtaque{

	@Override
	public void atacar(Luchador l) {
		int vidaR=l.vida-10;
		l.vida=vidaR;
		System.out.println(vidaR);
	}

	@Override
	public void recargar() {
		System.out.println("Recargé");
	}

}
