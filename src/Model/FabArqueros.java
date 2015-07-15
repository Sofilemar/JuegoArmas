package Model;

public class FabArqueros implements FabLuchador{
	
	public static final int DA�O_ARCO = 3;
	public static final int DA�O_CUCHILLO = 1;
	
	public Arma ponerArmaLejana(){
		return new Arco(DA�O_ARCO,"Libertad");
	}
	
	public Arma ponerArmaCercana(){
		return new Cuchillo(DA�O_CUCHILLO,"Venganza");
	}

	@Override
	public Armadura ponerArmadura() {
		return new Ligera(8);
	}

}
