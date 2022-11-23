import java.util.*;

public class Exercicio1 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    String frase = teclado.nextLine();
    String[] palavras = frase.split(" ");

    Map<String, Integer> mapa = new HashMap<String, Integer>();
    mapa.put(palavras[0], 0);
    mapa.put(palavras[1], 1);

    System.out.println(mapa.getValue());
  }
}
