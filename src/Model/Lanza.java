package Model;

public class Lanza extends Arma {

	public Lanza(int da�o, String nombre) {
		super(da�o, nombre);
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return "lanza: " +nombre;
	}
	@Override
	public int getDa�o() {
		return 3;
	}

}
