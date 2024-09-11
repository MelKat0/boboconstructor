package aula7;

public class Animal {
	private double tamanho;
	private String cor;
	
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	//***************************************//
	public Animal(double tamanho, String cor) {
		this.tamanho = tamanho;
		this.cor = cor;
	}
	public Animal(double tamanho) {
		this.tamanho = tamanho;
	}
	public Animal(String cor) {
		this.cor = cor;
	}
}
