package Creacion_ficha_vampiro_aleatoria;

import java.util.Scanner;

public class Ficha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Brujah brujah = new Brujah();

		brujah.VampiroAtributos();
		brujah.brujahDisciplinas();
		
		System.out.println(brujah);

		sc.close();
	}

}
