package Model;

public abstract class Luchador {

	protected Arma arma;
	protected Armadura arm;
	
	protected FabLuchador fb;
	
	public Luchador(FabLuchador fb) {
		super();
		this.fb=fb;
	}



	protected abstract void setear();
}
