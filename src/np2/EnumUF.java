package np2;

public enum EnumUF {
	
	    DF ("Distrito Federal"),
	    SP ("S�o Paulo"),
		RJ ("Rio de Janeiro");
		 
	    private String descricao;
	    
	    EnumUF(String descricao) {
	        this.descricao = descricao;
	    }
	    
	    public String getDescricao() {
	        return descricao;
	    }
	
}
