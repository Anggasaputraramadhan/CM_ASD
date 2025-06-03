public class bbm {
    String namaBBM;
    double hargaPerLiter;

    public BBM(String namaBBM, double harga) {
        this.namaBBM = namaBBM;
        this.hargaPerLiter = harga;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama BBM        : " + namaBBM);
        System.out.println("Harga per Liter : " + hargaPerLiter);
    }

    public static void main(String[] args) {
        BBM bbm = new BBM("Pertalite", 10000);
        bbm.tampilkanInformasi();
    }
}