class Fruits {
    String nama;
    int harga;

    Fruits(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    void tampilkan() {
        System.out.println("Nama Menu: " + nama);
        System.out.println("Harga: Rp" + harga);
    }
}

class AppleJuice extends Fruits {
    AppleJuice() {
        super("Jus Apel", 12000);
    }

    void bahan() {
        System.out.println("Bahan: Apel");
    }
}

class OrangeJuice extends Fruits {
    OrangeJuice() {
        super("Jus Jeruk", 10000);
    }

    void bahan() {
        System.out.println("Bahan: Jeruk");
    }
}

class BananaSmoothie extends Fruits {
    BananaSmoothie() {
        super("Smoothie Pisang", 15000);
    }

    void bahan() {
        System.out.println("Bahan: Pisang dan susu");
    }
}

public class FruitsCafe {
    public static void main(String[] args) {
        AppleJuice a = new AppleJuice();
        OrangeJuice o = new OrangeJuice();
        BananaSmoothie b = new BananaSmoothie();

        System.out.println("=== MENU MINUMAN BUAH ===");

        a.tampilkan();
        a.bahan();

        System.out.println();

        o.tampilkan();
        o.bahan();

        System.out.println();

        b.tampilkan();
        b.bahan();
    }
}