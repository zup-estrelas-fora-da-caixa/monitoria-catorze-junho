package monitoria;

public class Produto {
	
	private String nome;
	private double preco;
	private int imposto;
	private int total;
 
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getImposto() {
		return imposto;
	}
	public void setImposto(int imposto) {
		this.imposto = imposto;
	} 
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public static int calcularImposto(int preco, int imposto) {
		
		return preco + (preco*imposto/100);
	}
	
	@Override
	public String toString() {
		String modelo = "";
		modelo += "nome: "+this.nome+"\n";
		modelo += "preço: "+this.preco;
		
		return modelo;
	
	}
	
	
}
