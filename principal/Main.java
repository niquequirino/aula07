package principal;

import java.util.Scanner;

import entidade.Cachorro;
import entidade.Gato;
import entidade.Vaca;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cachorro c = new Cachorro();
		Gato g = new Gato();
		Vaca v = new Vaca();
		
		System.out.println("O som do gato é: " + g.EmitirSom());
		System.out.println("O som do cachorro é: " + c.EmitirSom() );
		System.out.println("O som da vaca é: " + v.EmitirSom() );
	}

}
