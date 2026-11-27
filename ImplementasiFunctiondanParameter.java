
import java.util.Scanner;

public class  ImplementasiFunctiondanParameter {

    // Method untuk menampilkan daftar menu
    static void tampilkanMenu() {
        System.out.println("\n=== MENU CAFE / WARKOP ===");
        System.out.println("1. Kopi Susu  - Rp12000");
        System.out.println("2. Kopi Hitam - Rp8000");
        System.out.println("3. Teh Manis  - Rp5000");
        System.out.println("4. Mi Instan  - Rp10000");
    }

    // Method untuk menentukan harga menu
    static double tentukanHarga(int pilihan) {
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

    // Method untuk menentukan nama menu
    static String tentukanNama(int pilihan) {
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

    // Method untuk menghitung total harga
    static double hitungTotal(double harga, int jumlah) {
        return harga * jumlah;
    }

    // Method untuk mencetak struk
    static void cetakStruk(
            String nama, double harga, int jumlah, double total) {
        System.out.println("\n=== STRUK PEMBELIAN ===");
        System.out.println("Nama menu   : " + nama);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Jumlah      : " + jumlah);
        System.out.println("Total bayar : Rp" + total);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        tampilkanMenu();

        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        double harga = tentukanHarga(pilihan);
        String nama = tentukanNama(pilihan);

        if (harga == 0) {
            System.out.println("Pilihan menu tidak valid!");
        } else {
            System.out.print("Jumlah pesanan: ");
            int jumlah = input.nextInt();

            if (jumlah <= 0) {
                System.out.println(
                    "Jumlah pesanan harus lebih dari 0."
                );
            } else {
                double total = hitungTotal(harga, jumlah);
                cetakStruk(nama, harga, jumlah, total);
            }
        }

        input.close();
    }
}