enum DiaDaSemana{
  DOMINGO,
  SEGUNDA,
  TERCA,
  QUARTA,
  QUINTA,
  SEXTA,
  SABADO
}

class Semana{
  private DiaDaSemana dia;

  Semana(DiaDaSemana dia){
    this.dia = dia;
  }

  public boolean ehDiaUtil(){
    if(this.dia != DiaDaSemana.DOMINGO && this.dia != DiaDaSemana.SABADO){
      return true;
    }
    return false;
  }

}


public class Main {
  public static void main(String[] args) {
    
    Semana s = new Semana(DiaDaSemana.TERCA);
    System.out.println(s.ehDiaUtil());
    
  }
}
