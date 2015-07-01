package Model;

public class Handler {
	public Luchador crearLuchador(Utils tipo)
	{
		FabLuchador fl=null;
		Luchador l=null;
		
		switch(tipo)
		{
			case GLADIADOR:
				fl=new FabGladiador();
				l=new Gladiador(fl);
				break;
			case ARQUERO:
				fl=new FabArqueros();
				l=new Arquero(fl);
				break;
		}
		
		return l;
	}
}
