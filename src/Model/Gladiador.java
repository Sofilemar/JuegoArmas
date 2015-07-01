package Model;

public class Gladiador extends Luchador {

	
	public Gladiador(FabLuchador fl) {
		super(fl);
		setear();
	}

	@Override
	protected void setear() {
		this.arma=fb.ponerArma();
		this.arm= fb.ponerArmadura();
	}

}
