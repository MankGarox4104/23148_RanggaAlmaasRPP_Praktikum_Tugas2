public class Matematika implements OperasiMatematika {

    // Implementasi method pertambahan
    @Override
    public int pertambahan(int a, int b) {
        return a + b;
    }

    // Implementasi method pengurangan
    @Override
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Implementasi method perkalian
    @Override
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Implementasi method pembagian
    @Override
    public int pembagian(int a, int b) {
        // Memastikan pembagian tidak dengan 0
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return a / b;
    }
}
