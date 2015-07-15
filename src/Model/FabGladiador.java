package Model;

public class FabGladiador implements FabLuchador{

	public static final int DA�O_LANZA = 1;
	public static final int DA�O_ESPADA = 3;

	@Override
	public Armadura ponerArmadura() {
		return new Pesada (10);
	}

	@Override
	public Arma ponerArmaLejana() {
		return new Lanza(DA�O_LANZA, "Profunda");
	}

	@Override
	public Arma ponerArmaCercana() {
		return new Espada (DA�O_ESPADA,"Temerosa");
	}

}
