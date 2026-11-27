
import java.util.Scanner;

class Cafe {
    private String nama;
    private int makanan, minuman, jumlahMakanan, jumlahMinuman;
    private double totalMakanan, totalMinuman, total;

    public Pesanan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getMakanan() {
        return makanan;
    }

    public int getMinuman() {
        return minuman;
    }

    public int getJumlahMakanan() {
        return jumlahMakanan;
    }

    public int getJumlahMinuman() {
        return jumlahMinuman;
    }

    public double getTotalMakanan() {
        return totalMakanan;
    }

    public double getTotalMinuman() {
        return totalMinuman;
    }

    public double getTotal() {
        return total;
    }

    public void setMakanan(int makanan) {
        this.makanan = makanan;
    }

    public void setMinuman(int minuman) {
        this.minuman = minuman;
    }

    public void setJumlahMakanan(int jumlah) {
        jumlahMakanan = jumlah;
    }

    public void setJumlahMinuman(int jumlah) {
        jumlahMinuman = jumlah;
    }

    public void setTotalMakanan(double total) {
        totalMakanan = total;
    }

    public void setTotalMinuman(double total) {
        totalMinuman = total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

class PesananCafe extends Pesanan {
    public PesananCafe(String nama) {
        super(nama);
    }

    public void hitung() {
        double hargaMakanan = 0;
        double hargaMinuman = 0;

        if (getMakanan() == 1) {
            hargaMakanan = 15000;
        } else if (getMakanan() == 2) {
            hargaMakanan = 12000;
        } else if (getMakanan() == 3) {
            hargaMakanan = 10000;
        }

        if (getMinuman() == 1) {
            hargaMinuman = 12000;
        } else if (getMinuman() == 2) {
            hargaMinuman = 8000;
        } else if (getMinuman() == 3) {
            hargaMinuman = 5000;
        }

        setTotalMakanan(hargaMakanan * getJumlahMakanan());
        setTotalMinuman(hargaMinuman * getJumlahMinuman());
        setTotal(getTotalMakanan() + getTotalMinuman());
    }
}

public class Warkop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KASIR CAFE / WARKOP ===");
        System.out.print("Nama pembeli: ");
        String nama = input.nextLine();

        PesananCafe data = new PesananCafe(nama);

        System.out.println("\n=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng - Rp15000");
        System.out.println("2. Mi Goreng   - Rp12000");
        System.out.println("3. Roti Bakar  - Rp10000");
        System.out.print("Pilih makanan: ");
        data.setMakanan(input.nextInt());

        System.out.println("\n=== MENU MINUMAN ===");
        System.out.println("1. Kopi Susu  - Rp12000");
        System.out.println("2. Kopi Hitam - Rp8000");
        System.out.println("3. Teh Manis  - Rp5000");
        System.out.print("Pilih minuman: ");
        data.setMinuman(input.nextInt());

        System.out.print("Jumlah makanan: ");
        data.setJumlahMakanan(input.nextInt());

        System.out.print("Jumlah minuman: ");
        data.setJumlahMinuman(input.nextInt());

        if (data.getMakanan() >= 1 && data.getMakanan() <= 3 &&
            data.getMinuman() >= 1 && data.getMinuman() <= 3 &&
            data.getJumlahMakanan() > 0 && data.getJumlahMinuman() > 0) {

            data.hitung();

            System.out.println("\n=== STRUK PEMBELIAN ===");
            System.out.println("Nama pembeli: " + data.getNama());
            System.out.println("Total makanan: Rp" + data.getTotalMakanan());
            System.out.println("Total minuman: Rp" + data.getTotalMinuman());
            System.out.println("Total bayar: Rp" + data.getTotal());

        } else {
            System.out.println("Pesanan tidak valid!");
        }

        input.close();
    }
}

