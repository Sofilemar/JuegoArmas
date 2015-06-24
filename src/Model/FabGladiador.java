package Model;

public class FabGladiador implements FabLuchador{

	@Override
	public Arma ponerArma() {
		return new Espada(80, "Temerosa");
	}

	@Override
	public Armadura ponerArmadura() {
		return new Pesada (90);
	}

}
