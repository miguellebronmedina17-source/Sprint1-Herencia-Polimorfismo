package HerenciaYPolimorfismo;

public class Main {
  public static void main(String[] args) {
      WindInstrument windInstrument = new WindInstrument("Flauta", 250.0);
       StringInstrument stringInstrument = new StringInstrument("Guitarra", 500.0);
       PercussionInstrument percussionInstrument = new PercussionInstrument("Bateria", 1200.0);
       //Polimorfismo
       windInstrument.play();
       stringInstrument.play();
       percussionInstrument.play();
       Instrument.showClassInfo();
  }
}



