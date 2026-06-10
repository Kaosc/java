package oop.exceptions;

// Main class to demonstrate custom exception
class HataliSicaklikException extends Exception {
   public HataliSicaklikException(String mesaj) {
      super(mesaj);
   }
}

public class CustomException {

   public void sicaklikAyarla(int derece) throws HataliSicaklikException {
      if (derece < 18 || derece > 28) {
         throw new HataliSicaklikException("Sıcaklık 18-28 derece arasında olmalıdır!");
      } else {
         System.out.println("Oda sıcaklığı " + derece + " derece olarak ayarlandı");
      }
   }

   public static void main(String[] args) {
      try {
         CustomException oda = new CustomException();
         oda.sicaklikAyarla(10);
      } catch (HataliSicaklikException e) {
         System.out.print(e.getMessage());
      }
   }
}
