public class TransaksiPengisian {
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
}