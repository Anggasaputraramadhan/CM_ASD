import java.util.Scanner;

public class Main {
    static Kendaraan inputKendaraan(Scanner scan) {
        System.out.print("Masukkan Plat: ");
        String plat = scan.nextLine();
        System.out.print("Masukkan Tipe: ");
        String tipe = scan.nextLine();
        System.out.print("Masukkan Merk: ");
        String merk = scan.nextLine();
        return new Kendaraan(plat, tipe, merk);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoubleLinkedList24 list = new DoubleLinkedList24();
        Queue x = new Queue(100); 
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
                Kendaraan kndraan = inputKendaraan(input);
                list.addLast(kndraan);
                break;
            case 2:
                list.print();
                break;
            case 3:
                break;

            case 4:
             if (list.isEmpty()) {
                System.out.println("Tidak ada kendaraan dalam antrian");
                break;
            }
            Kendaraan kendaraanDilayani = list.head.data;
            list.layaniKendaraan();
            System.out.print("Masukkan Jenis BBM: ");
            String jenisBBM = input.nextLine();
            System.out.print("Masukkan Harga per liter: ");
            double hargaPerLiter = input.nextDouble();
            System.out.print("Masukkan Jumlah liter: ");
            double jumlahLiter = input.nextDouble();
            input.nextLine();
            BBM bbm = new BBM(jenisBBM, hargaPerLiter);
            TransaksiPengisian transaksi = new TransaksiPengisian(kendaraanDilayani, bbm, jumlahLiter);
            x.enqueue(kendaraanDilayani.platNomor, "Rp " + transaksi.totalBayar);
            System.out.println(">> Transaksi berhasil dicatat.");
                break;
            case 5:
               System.out.println("\n-- Riwayat Transaksi --");
                System.out.println("Daftar Transaksi:");
                for (int i = 0; i < x.size; i++) {
                    int index = (x.front + i) % x.max;
                    System.out.println(x.plat[index] + ": " + x.totalHarga[index]);
                }
                break;

            case 0:
                break;

            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }


        } while (pilihan != 0);

        input.close();
    }
}