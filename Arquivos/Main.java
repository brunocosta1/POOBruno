/**
 * Main
 */
import java.io.*;

class Arquivo{

    private String msg = "Olá mundo!";

    void lerArquivoBin(){
        try{
            FileInputStream fis = new FileInputStream("input.txt");
            ObjectInputStream input = new ObjectInputStream(fis);
            Aluno data = (Aluno)input.readObject();

            System.out.println(data);
            input.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    void escreverArquivoBin(Object o){
        try{
            FileOutputStream fos = new FileOutputStream("input.txt");
            ObjectOutputStream output = new ObjectOutputStream(fos);
            output.writeObject(o);
            
            output.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

class Aluno implements Serializable{
    private String nome;
    private int idade;
    private String endereco;

    private static final long serialVersionUID = 201980;
    
    Aluno(String n, int id){
        this.nome = n;
        this.idade = id;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " Idade: " + this.idade;
    }
}

public class Main {
    public static void main(String[] args) {
        Arquivo arq = new Arquivo();
        Aluno al1 = new Aluno("Bruno", 23);
        //Aluno al2 = new Aluno("João", 14);

        //arq.escreverArquivoBin(al1);
        //arq.escreverArquivoBin(al2);
        arq.lerArquivoBin();
    }
}