package aula7;

public class Consulta {
	private String data;
	private String nome_p;
	private String nome_d;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getNome_p() {
		return nome_p;
	}
	public void setNome_p(String nome_p) {
		this.nome_p = nome_p;
	}
	public String getNome_d() {
		return nome_d;
	}
	public void setNome_d(String nome_d) {
		this.nome_d = nome_d;
	}
	//***************************************//
	public Consulta(String nome_p, String nome_d) {
		this.nome_p = nome_p;
		this.nome_d = nome_d;
	}
	public Consulta(String data, String nome_p, String nome_d) {
		this.data = data;
		this.nome_p = nome_p;
		this.nome_d = nome_d;
	}
	public Consulta(String data) {
		this.data = data;
	}
}
