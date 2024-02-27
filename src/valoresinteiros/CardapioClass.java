package valoresinteiros;

import java.util.Scanner;

public class CardapioClass {

	public static void main(String[] args) {
		// variaveis
		int Cardapio;
		int QuantidadePedido;
		int TotalApagar;
		
		//ler dados
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Codigo:1 - Cachorro Quente");
		System.out.println("Codigo:2 - X-Salada");
		System.out.println("Codigo:3 - X-Bacon");
		System.out.println("Codigo:4 - Bauru");
		System.out.println("Codigo:5 - Refrigerante");
		System.out.println("Codigo:6 - Suco de laranja");
		
		System.out.println("Digite sua opção: ");
		Cardapio = scanner.nextInt();		
		
		
		switch(Cardapio) {
		
		case 1:
			int CachorroQuente = 10;
			String CardapioCachorroQuente = "Cachorro Quente";
			
			System.out.println("Codigo 1/Cachorro Quente\r\n" + "\r\n" + "R$ 10.00");
			System.out.println("==================");
			System.out.println("Quantas pedidos?");
			QuantidadePedido = scanner.nextInt();
			System.out.println("==================");
			TotalApagar = (QuantidadePedido*CachorroQuente);
			System.out.println("Produto escolhido foi: " + CardapioCachorroQuente);
			System.out.println("Valor total a pagar: " + TotalApagar + "Reais");
			break;
		case 2:
			int XxSalada = 15;
			String CardapioXxSalada = "X-Salada";
			
			System.out.println("Codigo 2/X-Salada\r\n" + "\r\n" + "R$ 15.00");
			System.out.println("==================");
			System.out.println("Quantas pedidos?");
			QuantidadePedido = scanner.nextInt();
			System.out.println("==================");
			TotalApagar = (QuantidadePedido*XxSalada);
			System.out.println("Produto escolhido foi: " + CardapioXxSalada);
			System.out.println("Valor total a pagar: " + TotalApagar + "Reais");
			break;
		case 3:
			int XxBacon = 18;
			String CardapioXxBacon = "X-Bacon";
			
			System.out.println("Codigo 3/X-Bacon\r\n" + "\r\n" + "R$ 18.00");
			System.out.println("==================");
			System.out.println("Quantas pedidos?");
			QuantidadePedido = scanner.nextInt();
			System.out.println("==================");
			TotalApagar = (QuantidadePedido*XxBacon);
			System.out.println("Produto escolhido foi: " + CardapioXxBacon);
			System.out.println("Valor total a pagar: " + TotalApagar + "Reais");
			break;
		case 4:
			int PedidoBauru = 18;
			String CardapioBauru  = "Bauru";
			
			System.out.println("Codigo 4/Bauru\r\n" + "\r\n" + "R$ 18.00");
			System.out.println("==================");
			System.out.println("Quantas pedidos?");
			QuantidadePedido = scanner.nextInt();
			System.out.println("==================");
			TotalApagar = (QuantidadePedido*PedidoBauru);
			System.out.println("Produto escolhido foi: " + CardapioBauru);
			System.out.println("Valor total a pagar: " + TotalApagar + "Reais");
			break;
		case 5:
			int PedidoRefrigerante = 8;
			String CardapioRefrigerante  = "Refrigerante";
			
			System.out.println("Codigo 5/Refrigerante\r\n" + "\r\n" + "R$ 8.00");
			System.out.println("==================");
			System.out.println("Quantas pedidos?");
			QuantidadePedido = scanner.nextInt();
			System.out.println("==================");
			TotalApagar = (QuantidadePedido*PedidoRefrigerante);
			System.out.println("Produto escolhido foi: " + CardapioRefrigerante);
			System.out.println("Valor total a pagar: " + TotalApagar + "Reais");
			break;
		case 6:
			int PedidoSucolaranja = 13;
			String CardapioSucolaranja  = "Suco de laranja";
			
			System.out.println("Codigo 6/Suco de laranja\r\n" + "\r\n" + "R$ 13.00");
			System.out.println("==================");
			System.out.println("Quantas pedidos?");
			QuantidadePedido = scanner.nextInt();
			System.out.println("==================");
			TotalApagar = (QuantidadePedido*PedidoSucolaranja);
			System.out.println("Produto escolhido foi: " + CardapioSucolaranja);
			System.out.println("Valor total a pagar: " + TotalApagar + "Reais");
			break;
		default:
			System.out.println("Opção ivalida");
		}
		
		scanner.close();

	}

}
