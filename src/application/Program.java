package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		
		
		while (menu != 9) {
			
			System.out.println("[0] - Adicionar um produto");
			System.out.println("[1] - Remover um produto");
			System.out.println("[2] - Atualizar um produto");
			System.out.println("[3] - Listar produtos produtos");
			System.out.println("[9] - Sair do programa");
			menu = sc.nextInt();
			
		} 

	}
}
