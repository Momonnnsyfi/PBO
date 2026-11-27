
import java.util.Scanner;

public class KasirCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data pesanan
        System.out.println("=== SISTEM KASIR CAFE / WARKOP ===");

        System.out.print("Nama menu       : ");
        String namaMenu = input.nextLine();

        System.out.print("Harga satuan    : Rp");
        double harga = input.nextDouble();

        System.out.print("Jumlah pesanan  : ");
        int jumlah = input.nextInt();

        // Menghitung total harga
        double totalHarga = harga * jumlah;

        // Menampilkan hasil transaksi
        System.out.println("\n=== STRUK PEMBELIAN ===");
        System.out.println("Nama menu      : " + namaMenu);
        System.out.println("Harga satuan   : Rp" + harga);
        System.out.println("Jumlah pesanan : " + jumlah);
        System.out.println("Total harga    : Rp" + totalHarga);

        input.close();
    }
}