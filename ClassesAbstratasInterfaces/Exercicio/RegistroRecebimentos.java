import java.util.ArrayList;


public class RegistroRecebimentos{

	public static void main(String args[]){
    ArrayList<Recebivel> registros = new ArrayList<Recebivel>();

		Servico servico1 = new Servico("Conserto notebook.", 2, 8);
    ItemVenda item1 = new ItemVenda("Notebook", 2, 2000);

    registros.add(servico1);
    registros.add(item1);

    imprimeRegistros(registros);

	}

	public static void imprimeRegistros(ArrayList<Recebivel> registros){
    for(Recebivel r: registros){
      System.out.println(r);
    }
	}

}
