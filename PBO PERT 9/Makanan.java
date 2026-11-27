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