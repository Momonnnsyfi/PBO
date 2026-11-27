class Person {
    String nama;
    int umur;

    Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

class Customer extends Person {
    Customer(String nama, int umur) {
        super(nama, umur);
    }

    void aktivitas() {
        System.out.println("Aktivitas: Memesan makanan");
    }
}

class Cashier extends Person {
    Cashier(String nama, int umur) {
        super(nama, umur);
    }

    void aktivitas() {
        System.out.println("Aktivitas: Melayani pembayaran");
    }
}

class Barista extends Person {
    Barista(String nama, int umur) {
        super(nama, umur);
    }

    void aktivitas() {
        System.out.println("Aktivitas: Membuat kopi");
    }
}

public class PersonCafe {
    public static void main(String[] args) {
        Customer c = new Customer("Amanda", 20);
        Cashier k = new Cashier("Dias", 25);
        Barista b = new Barista("Momon", 23);

        System.out.println("=== DATA CUSTOMER ===");
        c.tampilkan();
        c.aktivitas();

        System.out.println("\n=== DATA KASIR ===");
        k.tampilkan();
        k.aktivitas();

        System.out.println("\n=== DATA BARISTA ===");
        b.tampilkan();
        b.aktivitas();
    }
}