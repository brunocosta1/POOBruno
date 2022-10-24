public class Servico implements Recebivel{
	String descricao;
	int horas;
	double precoHora;

	Servico(String d, int h, double pH){
		this.descricao = d;
		this.horas = h;
		this.precoHora = pH;
	}

	public double totalizarReceita(){
		return this.horas * this.precoHora;
	}

  @Override
  public String toString(){
    return "\nDescricao: " + this.descricao + "\n" + "Horas: " + this.horas + "\n" + "Preço horas: " + this.precoHora + "\n" + "Receita totalizada: " + this.totalizarReceita();
  }

}
