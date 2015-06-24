package Model;

public class Arco extends Arma{

	public Arco(int daño, String nombre) {
		super(daño, nombre);
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return "ARMA: Arco: " +nombre + " " + daño;
	}
}
