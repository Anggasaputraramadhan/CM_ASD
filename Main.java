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
                break;

            case 5:
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