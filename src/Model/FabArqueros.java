package Model;

public class FabArqueros implements FabLuchador{
	
	@Override
	public Arma ponerArma() {
		return new Arco (50, "Aguila");
	}

	@Override
	public Armadura ponerArmadura() {
		return new Ligera(40);
	}

}
