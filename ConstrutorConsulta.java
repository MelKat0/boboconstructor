package aula7;

public class ConstrutorConsulta {

	public static void main(String[] args) {

		Consulta consulta0 = new Consulta("Beatrice", "Tifanny");
		Consulta consulta1 = new Consulta("18/09/2000", "Geremias", "Ken Sato");
		Consulta consulta2 = new Consulta("31/07/2000");
		
		System.out.println(consulta0.getNome_p());
		System.out.println(consulta0.getNome_d());
		System.out.println(consulta1.getData());
		System.out.println(consulta1.getNome_p());
		System.out.println(consulta1.getNome_d());
		System.out.println(consulta2.getData());

	}

}
