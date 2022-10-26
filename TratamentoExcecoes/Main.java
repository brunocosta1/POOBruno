public class Main {
  public static void main(String[] args) {


    try {

      int[] vetor = new int[5];
      vetor[6] = 10;
      int b = 0;
      float r = 10 / b;
      System.out.println("\nCódigo importante\n");

    } catch (Exception e){

      System.out.println(e);

    } catch (ArrayIndexOutOfBoundsException e) {

      System.out.println(e);
    }
  }
}
