package Model;

public class Espada extends Arma {

	public Espada(int da�o, String nombre) {
		super(da�o, nombre);
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return "espada: " +nombre;
	}
	@Override
	public int getDa�o() {
		return 3;
	}
}
