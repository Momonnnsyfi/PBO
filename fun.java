
import java.util.Scanner;

public class fun {

    static String namaMenu(int p) {
        switch (p) {
            case 1: return "Kopi Susu";
            case 2: return "Kopi Hitam";
            case 3: return "Teh Manis";
            case 4: return "Mi Instan";
            default: return "";
        }
    }

    static double hargaMenu(int p) {
        switch (p) {
            case 1: return 12000;
            case 2: return 8000;
            case 3: return 5000;
            case 4: return 10000;
            default: return 0;
        }
    }

    static double hitungTotal(double harga, int jumlah) {
        return harga * jumlah;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== KASIR CAFE / WARKOP ===");
        System.out.println("1. Kopi Susu - Rp12000");
        System.out.println("2. Kopi Hitam - Rp8000");
        System.out.println("3. Teh Manis - Rp5000");
        System.out.println("4. Mi Instan - Rp10000");

        System.out.print("Pilih menu: ");
        int p = in.nextInt();

        if (p >= 1 && p <= 4) {
            System.out.print("Jumlah pesanan: ");
            int j = in.nextInt();

            if (j > 0) {
                double h = hargaMenu(p);
                double total = hitungTotal(h, j);

                System.out.println("\n=== STRUK ===");
                System.out.println("Menu: " + namaMenu(p));
                System.out.println("Harga: Rp" + h);
                System.out.println("Jumlah: " + j);
                System.out.println("Total: Rp" + total);
            } else {
                System.out.println("Jumlah tidak valid!");
            }
        } else {
            System.out.println("Menu tidak tersedia!");
        }

        in.close();
    }
}
