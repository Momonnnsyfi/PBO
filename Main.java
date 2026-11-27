class Employee {
    String nama = "Amanda";
}

class Manager extends Employee {
}

class Kasir extends Employee {
    void kerja() {
        System.out.println("Nama: " + nama);
        System.out.println("Pekerjaan: Melayani pembayaran");
    }
}

public class Main {
    public static void main(String[] args) {
        Kasir k = new Kasir();
        k.kerja();
    }
}