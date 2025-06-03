public class transaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter;
    }

    public void tampilkanInformasi() {
        System.out.println("=== Informasi Kendaraan ===");
        kendaraan.tampilkanInformasi();

        System.out.println("\n=== Informasi BBM ===");
        bbm.tampilkanInformasi();

        System.out.println("\nLiter BBM      : " + liter);
        System.out.println("Total Bayar    : Rp " + totalBayar);
    }

    public static void main(String[] args) {
        kendaraan k = new kendaraan("12345678", "Mobil", "Toyota");
        BBM bbm = new BBM("Pertamax", 13500);
        TransaksiPengisian tp = new TransaksiPengisian(k, bbm, 10);
        tp.tampilkanInformasi();
    }
}