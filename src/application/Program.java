package application;

import java.util.Scanner;

import entities.Hospedes;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Hospedes[] quartos = new Hospedes[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Aluguel #" + (i+1));
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Numero do quarto: ");
			int quarto = sc.nextInt();
			
			if(quartos[quarto] == null) {
				quartos[quarto] = new Hospedes(nome, email);
			}
		}
		
		System.out.println("Quartos alugados: ");
		for(int i = 0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(i+ ":" + quartos[i]);
			}
		}
		
		
		sc.close();
	}

}
