
import java.util.Scanner;

class Pesanan {
    String nama;

    Pesanan(String nama) {
        this.nama = nama;
    }

    void tampilNama() {
        System.out.println("Nama pembeli: " + nama);
    }
}

class Makanan extends Pesanan {
    int pilihan, jumlah, total;

    Makanan(String nama) {
        super(nama);
    }

    void hitung() {
        int harga = 0;

        if (pilihan == 1) {
            harga = 15000;
        } else if (pilihan == 2) {
            harga = 12000;
        } else if (pilihan == 3) {
            harga = 10000;
        }

        total = harga * jumlah;
    }
}

class Minuman extends Pesanan {
    int pilihan, jumlah, total;

    Minuman(String nama) {
        super(nama);
    }

    void hitung() {
        int harga = 0;

        if (pilihan == 1) {
            harga = 12000;
        } else if (pilihan == 2) {
            harga = 8000;
        } else if (pilihan == 3) {
            harga = 5000;
        }

        total = harga * jumlah;
    }
}

public class Pesanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KASIR CAFE / WARKOP ===");
        System.out.print("Nama pembeli: ");
        String nama = input.nextLine();

        Makanan m = new Makanan(nama);
        Minuman n = new Minuman(nama);

        System.out.println("\n=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng - Rp15000");
        System.out.println("2. Mi Goreng - Rp12000");
        System.out.println("3. Roti Bakar - Rp10000");
        System.out.print("Pilih makanan: ");
        m.pilihan = input.nextInt();

        System.out.print("Jumlah makanan: ");
        m.jumlah = input.nextInt();

        System.out.println("\n=== MENU MINUMAN ===");
        System.out.println("1. Kopi Susu - Rp12000");
        System.out.println("2. Kopi Hitam - Rp8000");
        System.out.println("3. Teh Manis - Rp5000");
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
