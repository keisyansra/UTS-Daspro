import java.util.Scanner;

public class BuahBuahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalHarga = 0.0;

        String[] macamBuah = {"Mangga", "Apel", "Anggur"};
        double[] hargaPerKilogram = {5.00, 3.00, 2.00};

        System.out.println("Menu Buah");
        for (int i = 0; i < macamBuah.length; i++) {
            System.out.println((i + 1) + ". " + macamBuah[i] + " - $" + hargaPerKilogram[i] + " per kilogram");
        }
        System.out.println((macamBuah.length + 1) + ". Keluar");

        while (true) {
            System.out.print("Masukkan buah yang akan dipilih (1/2/3/4): ");
            int pilihan = input.nextInt();

            if (pilihan == macamBuah.length + 1) {
                break;
            } else if (pilihan < 1 || pilihan > macamBuah.length) {
                System.out.println("Pilihan tidak cocok. Tolong pilih opsi yang cocok.");
                continue;
            }

            int indexPilihan = pilihan - 1;
            String namaBuah = macamBuah[indexPilihan];
            double hargaPerKilogramSelected = hargaPerKilogram[indexPilihan];

            System.out.print("Masukkan berat buah (dalam kilogram): ");
            double berat = input.nextDouble();

            double hargaItem = hargaPerKilogramSelected * berat;
            totalHarga += hargaItem;

            System.out.println("Harga dari " + namaBuah + " (" + namaBuah + " kilogram) adalah: $" + hargaItem);
        }

        System.out.println("Total harga yang harus dibayar: $" + totalHarga);
        System.out.println("Terimakasih sudah berbelanja!");
        input.close();
    }
}