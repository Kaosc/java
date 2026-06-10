package oop.exceptions;

// Main exception
class SistemException extends Exception {
   public SistemException(String mesaj) {
      super(mesaj);
   }

   public SistemException(String mesaj, Throwable sebep) {
      super(mesaj, sebep);
   }
}

// Sub exception of SistemException
class InternetKesikException extends SistemException {
   public InternetKesikException() {
      super("Ev internete bağlı değil");
   }
}

class EvGuvenlik {
   public void sistemAktifEt(boolean isConnected) throws SistemException {
      try {
         internetKontrol(isConnected);
      } catch (Exception e) {
         throw new SistemException("Güvenlik sistemi aktif edilemedi!", e);
      }
   }

   private void internetKontrol(boolean isConnected) throws InternetKesikException {
      if (isConnected) {
         System.out.println("Sistem aktif edildi!");
         return;
      }

      throw new InternetKesikException();
   }
}

public class ChainCustomException {
   public static void main(String[] args) throws SistemException {
      try {
         boolean isConnected = false;
         new EvGuvenlik().sistemAktifEt(isConnected);
      } catch (Exception e) {
         System.out.println("Hata: " + e.getMessage());
         System.out.println("Hata ana sebebi: " + e.getCause().getMessage());
      }
   }
}
