import java.util.Scanner;
public class UprakDaspro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan nilai Tes Potensi Akademik (0-100) : ");
        double nilaiTesPotensiAkademik = sc.nextDouble();

        System.out.println("Masukkan nilai Bahasa Inggris(0-100) : ");
        double nilaiBahasaIngrris = sc.nextDouble();

        System.out.println("Masukkan nilai Tes Wawancara (0-100) : ");
        double nilaiTesWawancara = sc.nextDouble();

        double bobotPotensiAkademik = 0.5;
        double bobotBahasaInggris = 0.3;
        double bobotTesWawancara = 0.2;

        double nilaiAkhir = (nilaiTesPotensiAkademik * bobotPotensiAkademik) + (nilaiBahasaIngrris * bobotBahasaInggris) + (nilaiTesWawancara * bobotTesWawancara);

        System.out.println("Hasil nilai akhir calon mahasiswa : " + nilaiAkhir);

    }
}