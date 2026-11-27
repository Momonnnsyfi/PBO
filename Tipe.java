
import java.util.Scanner;

public class Tipe {

    // Sesi 4: Method untuk menampilkan menu
    static void tampilkanMenu() {
        System.out.println("\n=== MENU CAFE / WARKOP ===");
        System.out.println("1. Kopi Susu  - Rp12000");
        System.out.println("2. Kopi Hitam - Rp8000");
        System.out.println("3. Teh Manis  - Rp5000");
        System.out.println("4. Mi Instan  - Rp10000");
    }

    // Function untuk menentukan nama menu
    static String namaMenu(int pilihan) {
        switch (pilihan) {
            case 1:
                return "Kopi Susu";
            case 2:
                return "Kopi Hitam";
            case 3:
                return "Teh Manis";
            case 4:
                return "Mi Instan";
            default:
                return "Menu tidak tersedia";
        }
    }

    // Function untuk menentukan harga
    static double hargaMenu(int pilihan) {
        switch (pilihan) {
            case 1:
                return 12000;
            case 2:
                return 8000;
            case 3:
                return 5000;
            case 4:
                return 10000;
            default:
                return 0;
        }
    }

    // Function menghitung total pembayaran
    static double hitungTotal(double harga, int jumlah) {
        return harga * jumlah;
    }

    //Method untuk menampilkan struk
    static void cetakStruk(
            String nama, double harga,
            int jumlah, double total) {

        System.out.println("\n=== STRUK PEMBELIAN ===");
        System.out.println("Nama menu   : " + nama);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Jumlah      : " + jumlah);
        System.out.println("Total bayar : Rp" + total);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  Tipe data, variabel, dan input
        System.out.println("=== SISTEM KASIR CAFE / WARKOP ===");

        tampilkanMenu();

        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        // Control Statement
        if (pilihan >= 1 && pilihan <= 4) {

            String nama = namaMenu(pilihan);
            double harga = hargaMenu(pilihan);

            System.out.print("Jumlah pesanan: ");
            int jumlah = input.nextInt();

            if (jumlah > 0) {
                //  Expression
                double total = hitungTotal(harga, jumlah);

                // Pemanggilan function dan parameter
                cetakStruk(nama, harga, jumlah, total);

            } else {
                System.out.println(
                    "Jumlah pesanan harus lebih dari 0!"
                );
            }

        } else {
            System.out.println("Pilihan menu tidak valid!");
        }

        input.close();
    }
}
