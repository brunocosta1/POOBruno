public class ItemVenda implements Recebivel{

	String produto;
	int quantidade;
	double precoUnitario;

	ItemVenda(String p, int qtd, double pU){
		this.produto = p;
		this.quantidade = qtd;
		this.precoUnitario = pU;
	}

	public double totalizarReceita(){
		return this.quantidade * this.precoUnitario;
	}

  @Override
  public String toString(){
    return "\nProduto: " + this.produto + "\n" + "Quantidade: " + this.quantidade + "\n" + "Preço unitario: " + this.precoUnitario + "\n" + "Receita totalizada: " + this.totalizarReceita();
  }
}
