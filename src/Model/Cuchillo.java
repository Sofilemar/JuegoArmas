package Model;

public class Cuchillo extends Arma{

	public Cuchillo(int daño, String nombre) {
		super(daño, nombre);
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return "cuchillo: " +nombre;
	}
	@Override
	public int getDaño() {
		return 1;
	}

}
