package aula7;

public class ConstrutorAnimal {

	public static void main(String[] args) {
	
		Animal animal0 = new Animal(8, "Amarelo e marrom");
		Animal animal1 = new Animal(2);
		Animal animal2 = new Animal("preto");
		
		System.out.println(animal0.getTamanho());
		System.out.println(animal0.getCor());
		System.out.println(animal1.getTamanho());
		System.out.println(animal2.getCor());
	}

}
