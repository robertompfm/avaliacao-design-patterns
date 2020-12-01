package model;

public class Casa implements Pertence {
	
	private double area;
	private int quartos;
	private int banheiros;
	private double preco;
	
	public Casa(double area, int quartos, int banheiros, double preco) {
		this.area = area;
		this.quartos = quartos;
		this.banheiros = banheiros;
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getQuartos() {
		return quartos;
	}

	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}

	public int getBanheiros() {
		return banheiros;
	}

	public void setBanheiros(int banheiros) {
		this.banheiros = banheiros;
	}
	
	@Override
	public String accept(Visitor visitor) {
		return visitor.criarAnuncioCasa(this);
	}
	
}
