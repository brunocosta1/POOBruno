class Externa{
  private int valor;

  public Externa(int valor){
    this.valor = valor;
  }

  class Aninhada{
    public void exibir(){
      System.out.println("valor = " + valor);
    }
  }
}


public class Main {
  public static void main(String[] args) {

    Externa c = new Externa(100);
    Externa.Aninhada b = c.new Aninhada();


    b.exibir();
    
  }
}
