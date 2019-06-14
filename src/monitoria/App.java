package monitoria;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Prateleira prateleira = new Prateleira();
		
		for(int i =0; i < 2; i++) {
			System.out.println("QUa o nome do produto");
			String nome = scan.next();
			prateleira.addProuto(new Produto(nome, 1.30));
		}
		
		Produto p1 = new Produto("Choquito", 2.50);
		Produto p2 = new Produto("Toddy", 3.40);
		prateleira.addProuto(p1);
		prateleira.addProuto(p2);
		
		System.out.println(prateleira);

		prateleira.removerProduto("Choquito");
		
		System.out.println("\n "+ prateleira);
	}
}
