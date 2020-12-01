package view;

import java.util.ArrayList;
import java.util.List;

import model.Casa;
import model.Eletrodomestico;
import model.Movel;
import model.Pertence;
import model.RepresentanteCAPSLOCK;

public class Main {

	public static void main(String[] args) {
		RepresentanteCAPSLOCK representanteCAPSLOCK = new RepresentanteCAPSLOCK();
		List<Pertence> pertences = new ArrayList<Pertence>();
		
		Casa casa = new Casa(150, 2, 2, 150000);
		Movel cadeira = new Movel("Cadeira", 30);
		Movel mesa = new Movel("Mesa", 150);
		Eletrodomestico tv = new Eletrodomestico("Televisao", "Sony", 1500);
		
		pertences.add(casa);
		pertences.add(cadeira);
		pertences.add(mesa);
		pertences.add(tv);
		
		for (Pertence pertence : pertences) {
			String anuncio = pertence.accept(representanteCAPSLOCK);
			System.out.println(anuncio);
		}
	}
}
