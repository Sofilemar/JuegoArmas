package Model;

public class FabArqueros implements FabLuchador{
	
	public static final int DAÑO_ARCO = 3;
	public static final int DAÑO_CUCHILLO = 1;
	
	public Arma ponerArmaLejana(){
		return new Arco(DAÑO_ARCO,"Libertad");
	}
	
	public Arma ponerArmaCercana(){
		return new Cuchillo(DAÑO_CUCHILLO,"Venganza");
	}

	@Override
	public Armadura ponerArmadura() {
		return new Ligera(8);
	}

}
