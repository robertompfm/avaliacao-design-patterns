package model;

public interface Visitor {

	String criarAnuncioCasa(Casa casa);
	
	String criarAnuncioMovel(Movel movel);
	
	String criarAnuncioEletrodomestico(Eletrodomestico eletrodomestico);
	
}
