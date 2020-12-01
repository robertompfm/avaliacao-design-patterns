package model;

public class Movel implements Pertence {
	
	private String nome;
	private double preco;
	
	public Movel(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String accept(Visitor visitor) {
		return visitor.criarAnuncioMovel(this);
	}
}
