package Model;

public class Arco extends Arma{

	public Arco(int da�o, String nombre) {
		super(da�o, nombre);
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		return "arco: " +nombre;
	}
	@Override
	public int getDa�o() {
		return 3;
	}
}
