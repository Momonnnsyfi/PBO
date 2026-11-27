public class MemoryManagement {

    public static void validasi() {
        System.out.println("Step 2: Memvalidasi data");
        System.out.println("Validasi selesai");
        return;
    }

    public static void simpanData() {
        System.out.println("Step 3: Menyimpan data");
        System.out.println("Data berhasil disimpan");
        return;
    }

    public static void pendaftaran() {
        System.out.println("Step 1: Memulai pendaftaran");
        validasi();
        System.out.println("Kembali ke proses pendaftaran");
        simpanData();
        System.out.println("Kembali ke proses pendaftaran");
        System.out.println("Pendaftaran selesai");
        return;
    }

    public static void main(String[] args) {
        System.out.println("Program dimulai");
        pendaftaran();
        System.out.println("Kembali ke main");
        System.out.println("Program selesai");
        return;
    }
}