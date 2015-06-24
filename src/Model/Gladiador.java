package Model;

public class Gladiador extends Luchador {

	
	public Gladiador(FabLuchador fl) {
		super(fl);
		setear();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setear() {
		
		this.arma=fb.ponerArma();
		this.arm= fb.ponerArmadura();
		System.out.println("Gladiador");
		System.out.println(arma);
		System.out.println(arm);
	}

}
