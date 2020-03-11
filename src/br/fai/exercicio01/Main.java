package br.fai.exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.Start();
		
	}

	private void Start() {
		
		Scanner scan = new Scanner(System.in);
		int valor = 0;
		while (valor != 10) {
			System.out.println("Escolha a opção que gostaria de entrar: \n 1- Adicionar valores: \n 2- Definir valor mais alto \n 3- Soma e Media: \n 10- Sair.");
			valor = scan.nextInt();
			switch(valor) {
			
			case 1:
				adicionarValores();
				
				break;
				
			case 2:
				
				
				break;
			case 3:
				
				break;
				
			case 4:
				
				break;
	
			case 5:
				
				break;
	
			case 6:
				
				break;
	
			case 7:
				
				break;
	
			case 10:
				
				break;
				
			default:
				System.out.println("O valor inserido é invalido.");
				
				break;
		
			}
		}
	}

	private void adicionarValores() {
		// TODO Auto-generated method stub
		
	}

}
