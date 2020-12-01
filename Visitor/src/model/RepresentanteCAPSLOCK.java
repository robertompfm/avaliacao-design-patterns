package model;

public class RepresentanteCAPSLOCK implements Visitor {

	@Override
	public String criarAnuncioCasa(Casa casa) {
		String stringParaAnuncio = "";
		stringParaAnuncio += "\n======================";
		stringParaAnuncio += ("\nCASA DE " + casa.getArea() + "M2");
		stringParaAnuncio += ("\nQUARTOS: " + casa.getQuartos());
		stringParaAnuncio += ("\nBANHEIROS: " + casa.getBanheiros());
		stringParaAnuncio += ("\nVALOR: R$ " + casa.getPreco());
		stringParaAnuncio += "\n======================";
		return stringParaAnuncio;
	}
	
	@Override
	public String criarAnuncioMovel(Movel movel) {
		String stringParaAnuncio = "";
		stringParaAnuncio += "\n======================";
		stringParaAnuncio += ("\nMOVEL: " + movel.getNome().toUpperCase());
		stringParaAnuncio += ("\nVALOR: R$ " + movel.getPreco());
		stringParaAnuncio += "\n======================";
		return stringParaAnuncio;
	}
	
	@Override
	public String criarAnuncioEletrodomestico(Eletrodomestico eletrodomestico) {
		String stringParaAnuncio = "";
		stringParaAnuncio += "\n======================";
		stringParaAnuncio += ("\nELETRODOMESTICO: " + eletrodomestico.getNome().toUpperCase());
		stringParaAnuncio += ("\nMARCA: " + eletrodomestico.getMarca().toUpperCase());
		stringParaAnuncio += ("\nVALOR: R$ " + eletrodomestico.getPreco());
		stringParaAnuncio += "\n======================";
		return stringParaAnuncio;
	}
}
