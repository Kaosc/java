// 3. Bir şirketin muhasebe departmanı, gelen faturaları düz metin formatında fatura.txt dosyasında tutmaktadır.
// Her fatura satırı alanları | ile ayrılmış biçimde yapılandırılmıştır. Veri analisti bu faturalardaki durum
// alanının kaldırılmasını, isimlerin anonimleştirilmesini ve satır alanlarının “,” virgül ile ayrılmasını
// istemektedir. Buna göre faturalar.txt dosyasını okuyup istenen işlemleri yaparak düzenlenmiş verileri
// veriseti.txt dosyasına yazdıran programın java kodunu yazınız. (30P)

// Faturalar.txt
// FATURA_NO|TARIH|MUSTERI|TUTAR|DURUM
// F-2024-001|2024-01-15|Ahmet Yilmaz|1250.00|ODENDI
// F-2024-002|2024-01-16|Zeynep Kaya|875.50|BEKLIYOR
// F-2024-004|2024-01-18|Ayse Sahin|620.75|IPTAL

// veriseti.txt
// FATURA_NO,TARIH,MUSTER,TUTAR
// F-2024-001,2024-01-15,K1,250.00
// F-2024-002,2024-01-16,K2,875.50
// F-2024-004,2024-01-18,K3,620.75

import java.io.*;

public class FaturaDuzenle {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new FileReader("./faturalar.txt"));
      BufferedWriter bw = new BufferedWriter(new FileWriter("./veriseti.txt"));

      String satir;
      int sayac = 1; // Counter for anonymized user IDs (K1, K2, ...)

      while ((satir = br.readLine()) != null) {
         // Splitting the line by "|" character
         String[] p = satir.split("\\|");

         if (p[0].equals("FATURA_NO")) {
            // Write header row for data output file
            bw.write("FATURA_NO,TARIH,MUSTERI,TUTAR");
         } else {
            // Writing cleaned data: p[0], p[1], Anonymized ID (K + sayac), p[3]
            bw.write(p[0] + "," + p[1] + ",K" + sayac + "," + p[3]);

            sayac++;
         }
         bw.newLine();
      }

      br.close();
      bw.close();
   }
}
