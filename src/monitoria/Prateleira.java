package monitoria;

import java.util.ArrayList;
import java.util.List;

public class Prateleira {
	
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public Prateleira(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public Prateleira() {
		
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void addProuto(Produto produto) {
		this.produtos.add(produto);
	}
	
	public void removerProduto(String nomeProduto) {
		for (Produto produto : this.produtos) {
			if(produto.getNome().equalsIgnoreCase(nomeProduto)) {
					this.produtos.remove(produto);
			}
		}
	}
	
	
	@Override
	public String toString() {
		String modelo = "";
		for (Produto produto : this.produtos) {
			modelo += "\n" + produto;
		}
		
		return modelo;
	}
	
	
}
