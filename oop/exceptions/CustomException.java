package oop.exceptions;

class HataliSicaklikException extends Exception {
   public HataliSicaklikException(String mesaj) {
      super(mesaj);
   }
}

class Oda {
   public void sicaklikAyarla(int derece) throws HataliSicaklikException {
      if (derece < 18 || derece > 28) {
         throw new HataliSicaklikException("Sıcaklık 18-28 derece arasında olmalıdır!");
      } else {
         System.out.println("Oda sıcaklığı " + derece + " derece olarak ayarlandı");
      }
   }
}

public class CustomException {
   public static void main(String[] args){
      try {
         Oda oda = new Oda();
         oda.sicaklikAyarla(23);
      } catch (Exception e) {
         System.out.print(e.getMessage());
      }
   }
}
