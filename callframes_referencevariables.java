public class callframes_referencevariables {

    public static void tampilkanData(String nama, int[] nilai) {
        // nama dan nilai adalah Reference Variables
        // yang disimpan di Stack hanya alamatnya, datanya ada di Heap
        System.out.println("Step 2: Di dalam tampilkanData");
        System.out.println("Nama = " + nama);
        System.out.println("Nilai pertama = " + nilai[0]);
        return;
    }

    public static void main(String[] args) {
        String namaMahasiswa = "ForeverLoop";
        int[] daftarNilai = {90, 85, 95};

        System.out.println("Program dimulai");
        System.out.println("Step 1: Membuat Reference Variable di main");
        tampilkanData(namaMahasiswa, daftarNilai);
        System.out.println("Kembali ke main");
        System.out.println("Program selesai");
        return;
    }
}