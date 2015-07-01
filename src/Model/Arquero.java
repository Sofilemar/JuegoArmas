package Model;

public class Arquero extends Luchador{

	public Arquero(FabLuchador fb) {
		super(fb);
		setear();
	}

	@Override
	public void setear() {
		this.arma=fb.ponerArma();
		this.arm=fb.ponerArmadura();
	}

}
