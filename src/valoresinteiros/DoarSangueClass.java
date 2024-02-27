package valoresinteiros;

import java.util.Scanner;

public class DoarSangueClass {

	public static void main(String[] args) {
		// variaveis
		int PessoaIdade;
		String PessoaNome;
		boolean PessoaDoador;
			
		//ler dados
		Scanner scanner = new Scanner(System.in);
		
		//entrada
		System.out.println("Digite seu nome: ");
		PessoaNome = scanner.next();
				
		System.out.println(PessoaNome + " Digite sua idade: ");
		PessoaIdade = scanner.nextInt();
		
		System.out.println(PessoaNome + " sua idade é: " + PessoaIdade + " Primeira doação de sangue? ");
		PessoaDoador = scanner.nextBoolean();
				
		if(PessoaDoador==true && PessoaIdade > 18 && PessoaIdade < 60) {
			System.out.println(PessoaNome + " sua idade é: " + PessoaIdade + " anos e está apto para doar sangue! ");
			
		}
		else if(PessoaDoador==true && PessoaIdade > 60 && PessoaIdade < 69) {
			System.out.println(PessoaNome + " sua idade é: " + PessoaIdade + " anos não está apto para doar sangue! ");
			
		}
		else if(PessoaDoador==false && PessoaIdade > 60 && PessoaIdade < 69 ){
				System.out.println(PessoaNome + " sua idade é: " + PessoaIdade + " está apto para doar sangue! ");
				PessoaDoador = scanner.nextBoolean();
		}
		else if(PessoaDoador==false || PessoaDoador==true || PessoaIdade < 18 || PessoaIdade > 70){
				System.out.println(PessoaNome + " não está apto para doar sangue! você não esta na faixetaria");
		}
		scanner.close();

	}

}
