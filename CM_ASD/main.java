import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SingleLinkedList listTransaksi = new SingleLinkedList();
        int pilihan;

        do {
            System.out.println("\n=== Menu SPBU ===");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
            case 1:
                System.out.print("Plat Nomor: ");
                String plat = input.nextLine();
                System.out.print("Tipe Kendaraan: ");
                String tipe = input.nextLine();
                System.out.print("Merk Kendaraan: ");
                String merk = input.nextLine();
                Kendaraan kendaraan = new Kendaraan(plat, tipe, merk);

                System.out.print("Nama BBM: ");
                String namaBBM = input.nextLine();
                System.out.print("Harga per Liter: ");
                double harga = input.nextDouble();
                input.nextLine();
                BBM bbm = new BBM(namaBBM, harga);

                System.out.print("Jumlah Liter: ");
                double liter = input.nextDouble();
                input.nextLine();

                TransaksiPengisian transaksi = new TransaksiPengisian(kendaraan, bbm, liter);
                antrian.tambahTransaksi(transaksi);
                System.out.println("Kendaraan berhasil ditambahkan ke antrian.");
                break;

            case 2:
                System.out.println("\n=== Menampilkan Antrian ===");
                antrian.tampilkanSemuaTransaksi();
                break;

            case 3:
                System.out.println("Cek Jumlah Antrian Kendaraan: " + antrian.hitungJumlah());
                break;

            case 4:
                TransaksiPengisian dilayani = antrian.layaniKendaraan();
                if (dilayani != null) {
                System.out.println("Kendaraan berikut telah dilayani:");
                dilayani.tampilkanTransaksi();
                riwayat.tambahTransaksi(dilayani);
            } else {
                System.out.println("Tidak ada kendaraan dalam antrian.");
            }
                break;

            case 5:
                System.out.println("\n=== Menampilkan Riwayat Transaksi ===");
                riwayat.tampilkanSemuaTransaksi();
                break;

            case 0:
                System.out.println("Terima kasih. Program selesai.");
                break;

            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }


        } while (pilihan != 0);
    }
}