public class callframes_simplevariables {

    public static void hitungNilai(int a, int b) {
        // a dan b adalah Simple Variables, nilainya disimpan langsung di Stack
        int hasil = a + b;
        System.out.println("Step 2: Di dalam hitungNilai");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Hasil = " + hasil);
        return;
    }

    public static void main(String[] args) {
        int I = 1;
        int x = 10;
        int y = 20;
        System.out.println("Program dimulai");
        System.out.println("Step 1: Variabel I = " + I);
        hitungNilai(x, y);
        System.out.println("Kembali ke main");
        System.out.println("Program selesai");
        return;
    }
}