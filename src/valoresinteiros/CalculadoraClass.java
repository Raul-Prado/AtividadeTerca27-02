package valoresinteiros;

import java.util.Scanner;

public class CalculadoraClass {

	public static void main(String[] args) {
		// variaveis
		int Opção;
		float NumeroA;
		float NumeroB;

		//ler dados
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Codigo:1 - Soma");
		System.out.println("Codigo:2 - Subtração");
		System.out.println("Codigo:3 - Multiplicação");
		System.out.println("Codigo:4 - Divisão");
		
		//entrada
		System.out.println("Digite um numero: ");
		NumeroA = scanner.nextInt();
		System.out.println("Digite um numero: ");
		NumeroB = scanner.nextInt();
		System.out.println("Digite sua opção: ");
		Opção = scanner.nextInt();	
		
		switch(Opção) {
		
			case 1:
				float SomaNumeros;
				SomaNumeros = NumeroA+NumeroB;
				System.out.println("Resultado:" + SomaNumeros);
				break;
			case 2:
				float SubNumeros;
				SubNumeros = NumeroA-NumeroB;
				System.out.println("Resultado:" + SubNumeros);
				break;
			case 3:
				float MultiNumeros;
				MultiNumeros = NumeroA*NumeroB;
				System.out.println("Resultado:" + MultiNumeros);
				break;
			case 4:
				float DivNumeros;
				DivNumeros = NumeroA/NumeroB;
				System.out.println("Resultado:" + DivNumeros);
				break;
			default:
				System.out.println("Opção ivalida");
		}
		
		scanner.close();
	}

}
