import java.util.Scanner;

public class Warkop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama pembeli: ");
        String nama = input.nextLine();

        Makanan m = new Makanan(nama);
        Minuman n = new Minuman(nama);

        System.out.println("\n=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng - 15000");
        System.out.println("2. Mi Goreng - 12000");
        System.out.println("3. Roti Bakar - 10000");
        System.out.print("Pilih makanan: ");
        m.pilihan = input.nextInt();

        System.out.print("Jumlah makanan: ");
        m.jumlah = input.nextInt();

        System.out.println("\n=== MENU MINUMAN ===");
        System.out.println("1. Kopi Susu - 12000");
        System.out.println("2. Kopi Hitam - 8000");
        System.out.println("3. Teh Manis - 5000");
        System.out.print("Pilih minuman: ");
        n.pilihan = input.nextInt();

        System.out.print("Jumlah minuman: ");
        n.jumlah = input.nextInt();

        if (m.pilihan >= 1 && m.pilihan <= 3 &&
            n.pilihan >= 1 && n.pilihan <= 3 &&
            m.jumlah > 0 && n.jumlah > 0) {

            m.hitung();
            n.hitung();

            System.out.println("\n=== STRUK PEMBELIAN ===");
            m.tampilNama();
            System.out.println("Total makanan: Rp" + m.total);
            System.out.println("Total minuman: Rp" + n.total);
            System.out.println("Total bayar: Rp" + (m.total + n.total));

        } else {
            System.out.println("Pesanan tidak valid!");
        }

        input.close();
    }
}