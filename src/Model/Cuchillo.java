package Model;

public class Cuchillo extends Arma{

	public Cuchillo(int da�o, String nombre) {
		super(da�o, nombre);
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return "cuchillo: " +nombre;
	}
	@Override
	public int getDa�o() {
		return 1;
	}

}
