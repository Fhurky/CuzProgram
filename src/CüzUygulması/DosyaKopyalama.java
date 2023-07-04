package CüzUygulması;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DosyaKopyalama {

    private String kaynakDosyaAdi;
    private String hedefDosyaAdi;

    public DosyaKopyalama(String kaynakDosyaAdi, String hedefDosyaAdi) {
        this.kaynakDosyaAdi = kaynakDosyaAdi;
        this.hedefDosyaAdi = hedefDosyaAdi;
    }

    public void kopyala() {
        try {
        	
        	Path hedefDosyaYolu = Path.of(hedefDosyaAdi);
            Files.deleteIfExists(hedefDosyaYolu);
            
            // Kaynak dosyayı oku
            StringBuilder icerik = new StringBuilder();
            try (BufferedReader okuyucu = new BufferedReader(new FileReader(kaynakDosyaAdi))) {
                String satir;
                while ((satir = okuyucu.readLine()) != null) {
                    icerik.append(satir).append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Hedef dosyaya yaz
            try (BufferedWriter yazici = new BufferedWriter(new FileWriter(hedefDosyaAdi))) {
                yazici.write(icerik.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("İçerik başarıyla kopyalandı.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void sil(String hedef) {
    	
    try {
    	Path hedefDosyaYolu1 = Path.of(hedef);
        Files.deleteIfExists(hedefDosyaYolu1);
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Lütfen kaynak ve hedef dosya adlarını girin.");
            return;
        }

        String kaynakDosyaAdi = args[0];
        String hedefDosyaAdi = args[1];

        DosyaKopyalama dosyaKopyalama = new DosyaKopyalama(kaynakDosyaAdi, hedefDosyaAdi);
        dosyaKopyalama.kopyala();
    }
}