import java.util.Scanner;
public class UprakDaspro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Masukkan nilai potensi akademik (0-100): ");
            double nilaiPotensiAkademik = sc.nextDouble();

            System.out.println("Masukkan nilai Bahasa Inggris(0-100) : ");
            double nilaiBahasaInggris = sc.nextDouble();

            System.out.println("Masukkan nilai Tes Wawancara (0-100) : ");
            double nilaiTesWawancara = sc.nextDouble();

            double bobotPotensiAkademik = 0.5;
            double bobotBahasaInggris = 0.3;
            double bobotTesWawancara = 0.2;

            double nilaiAkhir = (nilaiPotensiAkademik * bobotPotensiAkademik) + (nilaiBahasaInggris * bobotBahasaInggris) + (nilaiTesWawancara * bobotTesWawancara);

            System.out.println("Hasil nilai akhir calon mahasiswa : " + nilaiAkhir);

        if (nilaiBahasaInggris > 70 || nilaiTesWawancara > 80) {
            System.out.println("Anda diterima di jurusan Sistem Informasi");
        } else if (nilaiTesWawancara > 70 || nilaiBahasaInggris > 70 || nilaiPotensiAkademik > 70) {
            System.out.println("Anda diterima di jurusan Ilmu Komputer"); 
        } else if ((nilaiPotensiAkademik + nilaiBahasaInggris + nilaiTesWawancara) / 3 > 75 || nilaiBahasaInggris > 50) {
            System.out.println("Anda diterima di jurusan Bisnis Manajemen");
        } else if (nilaiBahasaInggris > 60 || nilaiTesWawancara >  60 || nilaiPotensiAkademik > 60 || (nilaiPotensiAkademik + nilaiBahasaInggris) > 100) {
            System.out.println("Anda diterima di jurusan Teknik Informatika");
        } else {
            System.out.println("Anda ditolak di jurusan yang dipilih");
        }
        }
            
        


    }
