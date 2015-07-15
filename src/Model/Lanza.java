package Model;

public class Lanza extends Arma {

	public Lanza(int daño, String nombre) {
		super(daño, nombre);
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return "lanza: " +nombre;
	}
	@Override
	public int getDaño() {
		return 3;
	}

}
