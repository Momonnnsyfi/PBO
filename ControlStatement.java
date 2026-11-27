
import java.util.Scanner;

public class  ControlStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMenu = "";
        double harga = 0;

        System.out.println("=== SISTEM KASIR CAFE / WARKOP ===");
        System.out.println("1. Kopi Susu  - Rp12000");
        System.out.println("2. Kopi Hitam - Rp8000");
        System.out.println("3. Teh Manis  - Rp5000");
        System.out.println("4. Mi Instan  - Rp10000");

        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        // Control Statement menggunakan switch
        switch (pilihan) {
            case 1:
                namaMenu = "Kopi Susu";
                harga = 12000;
                break;
            case 2:
                namaMenu = "Kopi Hitam";
                harga = 8000;
                break;
            case 3:
                namaMenu = "Teh Manis";
                harga = 5000;
                break;
            case 4:
                namaMenu = "Mi Instan";
                harga = 10000;
                break;
            default:
                System.out.println("Pilihan menu tidak tersedia!");
                input.close();
                return;
        }

        System.out.print("Jumlah pesanan: ");
        int jumlah = input.nextInt();

        // Control Statement menggunakan if-else
        if (jumlah <= 0) {
            System.out.println("Jumlah pesanan harus lebih dari 0.");
        } else {
            double totalHarga = harga * jumlah;

            System.out.println("\n=== STRUK PEMBELIAN ===");
            System.out.println("Nama menu   : " + namaMenu);
            System.out.println("Harga       : Rp" + harga);
            System.out.println("Jumlah      : " + jumlah);
            System.out.println("Total bayar : Rp" + totalHarga);
        }

        input.close();
    }
}