package Model;

public abstract class Arma {
	
	protected int daño;
	protected String nombre;
	
	public Arma(int daño, String nombre) {
		super();
		this.daño = daño;
		this.nombre = nombre;
	}

	public abstract int getDaño();

	public String getNombre() {
		return nombre;
	}
}
