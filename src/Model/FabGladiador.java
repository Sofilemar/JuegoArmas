package Model;

public class FabGladiador implements FabLuchador{

	public static final int DAÑO_LANZA = 1;
	public static final int DAÑO_ESPADA = 3;

	@Override
	public Armadura ponerArmadura() {
		return new Pesada (10);
	}

	@Override
	public Arma ponerArmaLejana() {
		return new Lanza(DAÑO_LANZA, "Profunda");
	}

	@Override
	public Arma ponerArmaCercana() {
		return new Espada (DAÑO_ESPADA,"Temerosa");
	}

}
