package Model;

public class Espada extends Arma {

	public Espada(int daño, String nombre) {
		super(daño, nombre);
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return "ARMA: Espada: " +nombre + " " + daño;
	}
}
