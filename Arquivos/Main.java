/**
 * Main
 */
import java.io.*;

class Arquivo{

    private String msg = "Olá mundo!";

    void lerArquivoBin(){
        try{
            InputStream input = new FileInputStream("input.txt");
            int data = input.read();

            while(data != -1){
                System.out.println((char)data);
                data = input.read();
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    void escreverArquivoBin(){
        try{
            OutputStream output = new FileOutputStream("input.txt");
            int count = 0;
            while(count < this.msg.length()){
                output.write(this.msg.charAt(count));
                count++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Arquivo a = new Arquivo();
        a.escreverArquivoBin();
        a.lerArquivoBin();
    }
}