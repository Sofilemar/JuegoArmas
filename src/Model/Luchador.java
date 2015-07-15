package Model;

import java.util.HashMap;
import java.util.Random;

public abstract class Luchador {

	protected Arma arma;
	protected HashMap <TipoArma, Arma> armasDisponibles;
	protected Armadura arm;
	protected EstrategiaAtaque ea;
	protected FabLuchador fb;
	protected int vida;
	private HashMap <Objetivo, EstrategiaAtaque> ataque;
	
	public Luchador(FabLuchador fb) {
		super();
		this.fb=fb;
		this.vida=10;
		ataque = new HashMap <Objetivo,EstrategiaAtaque> ();
		ataque.put(Objetivo.CERCANO,  new EstrategiaCercano());
		ataque.put(Objetivo.DISTANTE, new EstrategiaDistante());
		armasDisponibles = new HashMap <TipoArma,Arma> ();
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}

	protected abstract void setear();
	
	public Objetivo visualizarObjetivo()
	{
		Random md= new Random();
		int valorDado=md.nextInt(11);
		if(valorDado<5)
		{
			return Objetivo.CERCANO;
		}else
		{
			return Objetivo.DISTANTE;
		}
	}
	public EstrategiaAtaque cambiarEstrategia(Luchador atacante, Objetivo obj, HashMap ataque)
	{
		switch(obj)
		{
			case CERCANO:
				ea=(EstrategiaAtaque) ataque.get(obj);
				atacante.cambiarArma(TipoArma.CERCANIA);
				break;
			
			case DISTANTE:
				ea=(EstrategiaAtaque) ataque.get(obj);
				atacante.cambiarArma(TipoArma.DISTANCIA);
				break;
		}
		return ea;
	}
	public Arma getArma() {
		return arma;
	}

	public HashMap<TipoArma, Arma> getArmasDisponibles() {
		return armasDisponibles;
	}
	
	public Armadura getArm() {
		return arm;
	}

	public EstrategiaAtaque getEa() {
		return ea;
	}

	public FabLuchador getFb() {
		return fb;
	}

	public int getVida() {
		return vida;
	}

	public HashMap<Objetivo, EstrategiaAtaque> getAtaque() {
		return ataque;
	}

	public void ejecutarAtaque(Luchador atacante, Luchador atacado) 
	{		
		Objetivo obj;
		obj=this.visualizarObjetivo();
		this.cambiarEstrategia(atacante,obj,ataque);
		
		ea.atacar(atacante, atacado);
		
	}

	public abstract void cambiarArma(TipoArma ta);

	public void herido(int daño) {
		vida-=daño;
		if(vida<0)
			vida=0;
		
	}
	
	public boolean estaVivo(){
		return vida>0;
	}
	
}
