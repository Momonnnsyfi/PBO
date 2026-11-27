class Employee {
    String nama;
    int gaji;

    Employee(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: Rp" + gaji);
    }
}

class Cashier extends Employee {
    Cashier(String nama, int gaji) {
        super(nama, gaji);
    }

    void tugas() {
        System.out.println("Tugas: Melayani pembayaran");
    }
}

class Barista extends Employee {
    Barista(String nama, int gaji) {
        super(nama, gaji);
    }

    void tugas() {
        System.out.println("Tugas: Membuat minuman");
    }
}

class Waiter extends Employee {
    Waiter(String nama, int gaji) {
        super(nama, gaji);
    }

    void tugas() {
        System.out.println("Tugas: Mengantarkan pesanan");
    }
}

public class EmployeeCafe {
    public static void main(String[] args) {
        Cashier c = new Cashier("Amanda", 2500000);
        Barista b = new Barista("Alee", 2300000);
        Waiter w = new Waiter("Adul", 2200000);

        System.out.println("=== KARYAWAN CAFE ===");

        c.tampilkan();
        c.tugas();

        System.out.println();

        b.tampilkan();
        b.tugas();

        System.out.println();

        w.tampilkan();
        w.tugas();
    }
}
