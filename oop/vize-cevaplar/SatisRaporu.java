// 4. Bir e-ticaret firmasında günlük satış verileri program içerisinde dizilerde tutulmaktadır. Ürün adları, satış
// adetleri ve birim fiyatlar ayrı dizilerde saklanmakta ve her dizide aynı indeks aynı ürünü temsil
// etmektedir. Bu verilere dayanarak her ürün için toplam satış tutarının (adet × fiyat) hesaplanması
// gerekmektedir. Hesaplanan bu bilgiler, her ürün için “ürün adı – adet – birim fiyat – toplam tutar”
// formatında olacak şekilde satis_raporu.txt adlı bir dosyaya yazdırılmalıdır. Ayrıca toplam satış tutarı
// 50.000 TL’nin üzerinde olan ürünlerin satır başına “[YÜKSEK SATIŞ]” etiketi eklenmelidir. Tüm
// ürünlerin toplam satış tutarı da hesaplanarak dosyanın en altına “GENEL TOPLAM” başlığı ile birlikte
// yazdırılmalıdır. (Diziler başlatılarak oluşturulabilir. (20P)

// Örnek:
// {"Laptop", "Telefon", "Tablet", "Kulaklık"};
// {5, 12, 7, 20};
// {15000, 8000, 6000, 1500};

// satis_raporu.txt
// [YÜKSEK SATIŞ] Laptop - 5 adet - 15000 TL - Toplam: 75000 TL
// [YÜKSEK SATIŞ] Telefon - 12 adet - 8000 TL - Toplam: 96000 TL
// Tablet - 7 adet - 6000 TL - Toplam: 42000 TL
// Kulaklık - 20 adet - 1500 TL - Toplam: 30000 TL

// GENEL TOPLAM: 243000 TL

import java.io.*;

public class SatisRaporu {
   public static void main(String[] args) throws Exception {
      // Arrays represent Product Name, Quantity Sold (adet), and Unit Price (fiyat)
      String[] urun = { "Laptop", "Telefon", "Tablet", "Kulaklik" };
      int[] adet = { 5, 12, 7, 20 };
      int[] fiyat = { 15000, 8000, 6000, 1500 };

      BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\dev\\java\\oop\\vize-cevaplar\\satis_raporu.txt"));
      int genelToplam = 0;

      for (int i = 0; i < urun.length; i++) {
         int toplam = adet[i] * fiyat[i];
         genelToplam += toplam;

         if (toplam > 50000) {
            bw.write("[YUKSEK SATIS] ");
         }

         bw.write(urun[i] + " - "
               + adet[i] + " adet - "
               + fiyat[i] + " TL - Toplam: " + toplam + " TL");

         bw.newLine();
      }

      bw.write("GENEL TOPLAM: " + genelToplam + " TL");
      bw.close();
   }
}
