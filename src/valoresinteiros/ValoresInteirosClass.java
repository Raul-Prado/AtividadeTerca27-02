package valoresinteiros;

import java.util.Scanner;

public class ValoresInteirosClass {

	public static void main(String[] args) {
		// variaveis
		int NumeroA;
		int NumeroB;
		int NumeroC;
		int SomaAB;
		
		// ler dados
		Scanner scanner = new Scanner(System.in);
		
		//entrada
		System.out.println("Digite o 1 numero: ");
		NumeroA = scanner.nextInt();
		System.out.println("Digite o 2 numero: ");
		NumeroB = scanner.nextInt();
		System.out.println("Digite o 3 numero: ");
		NumeroC = scanner.nextInt();
		
		//soma valores
		SomaAB = (NumeroA + NumeroB);
		
		//condição
		if(SomaAB > NumeroC){
			System.out.println("A soma de A e B é: " + SomaAB + " é maior que " + NumeroC);
		}
		else if(SomaAB == NumeroC){
			System.out.println("A soma de A e B é: " + SomaAB + " é igual " + NumeroC);
		}
		else {
			System.out.println("A soma de A e B é: " + SomaAB + " é menor que " + NumeroC);
		}
		
		scanner.close();
		
	}

}
