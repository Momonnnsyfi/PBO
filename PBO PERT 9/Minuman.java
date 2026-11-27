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