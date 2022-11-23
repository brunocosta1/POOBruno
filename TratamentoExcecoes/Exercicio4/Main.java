public class Main {
  public static void main(String[] args) {
    generic("1");
  }

  <T> String generic(T t){
    return t.getClass().toString();
  }

}
