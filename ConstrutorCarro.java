package aula7;

public class ConstrutorCarro {

	public static void main(String[] args) {

		Carro carro0 = new Carro("FAZ-7791",7791);
		Carro carro1 = new Carro(8989);
		Carro carro2 = new Carro("EAZ-8349");

		System.out.println(carro0.getPlaca());
		System.out.println(carro0.getNumChassi());
		System.out.println(carro1.getNumChassi());
		System.out.println(carro2.getPlaca());

	}
}
