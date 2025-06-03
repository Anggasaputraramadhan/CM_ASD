public class main {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan("B1234XYZ", "Mobil", "Toyota");
        Kendaraan kendaraan2 = new Kendaraan("D9876ABC", "Motor", "Yamaha");

        BBM bbm1 = new BBM("Pertalite", 10000);
        BBM bbm2 = new BBM("Pertamax", 13500);

        TransaksiPengisian transaksi1 = new TransaksiPengisian(kendaraan1, bbm1, 20);
        TransaksiPengisian transaksi2 = new TransaksiPengisian(kendaraan2, bbm2, 5);

        System.out.println("=== TRANSAKSI 1 ===");
        transaksi1.tampilkanInformasi();

        System.out.println("\n=== TRANSAKSI 2 ===");
        transaksi2.tampilkanInformasi();
    }
}