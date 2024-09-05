public class Matematika {

    // Method untuk penambahan
    public int pertambahan(int a, int b) {
        return a + b;
    }

    // Method untuk pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Method untuk pembagian
    public int pembagian(int a, int b) {
        // Memastikan pembagian tidak dengan 0
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return a / b;
    }

    // Main method untuk testing
    public static void main(String[] args) {
        Matematika matematika = new Matematika();

        int tambah = matematika.pertambahan(10, 5);
        int kurang = matematika.pengurangan(10, 5);
        int kali = matematika.perkalian(10, 5);
        int bagi = matematika.pembagian(10, 5);

        System.out.println("Hasil Pertambahan: " + tambah);
        System.out.println("Hasil Pengurangan: " + kurang);
        System.out.println("Hasil Perkalian: " + kali);
        System.out.println("Hasil Pembagian: " + bagi);
    }
}
