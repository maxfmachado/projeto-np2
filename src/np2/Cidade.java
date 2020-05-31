package np2;

import java.util.ArrayList;

public class Cidade extends Entidade {
	
	public EnumUF UF;
    public ArrayList<Hotel> 	  hoteis;
    public ArrayList<Restaurante> restaurantes;
	
	public Cidade(int id, String nome, EnumUF UF) {
		
		this.id 		  		= id;
		this.nome 		  		= nome;
		this.UF					= UF;
        hoteis 			  		= new ArrayList<Hotel>();
        restaurantes			= new ArrayList<Restaurante>();
	}
	
	public ArrayList<Hotel> getHoteis() {
		return this.hoteis;
	}

	public ArrayList<Restaurante> getRestaurantes() {
		return this.restaurantes;
	}

	public int getId() {
		return this.id;
	}
	
}
