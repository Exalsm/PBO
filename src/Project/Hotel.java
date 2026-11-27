package Project;
import java.util.Scanner;

public class Hotel{
    
    static double total(double harga, int hari) { // fungsi & parameter
        return harga * hari;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data D = new Data("", "", "", "");
        String email;
        int hrga = 500000;
        int hri;
        int kamar;
        double bayar;
        int pilihan;
        
        System.out.println("==== Welcome to Hotel ====");
        do {
            System.out.println("Harga Kamar (permalam) : " + hrga);
            System.out.print("Pilih Kamar (1-3) : ");
            kamar = input.nextInt();
            
            if (kamar == 1 || kamar == 2) { // Statement Control
                System.out.println("Kamar Tersedia!");
            } else if (kamar == 3) {
                System.out.println("Kamar Sudah Di pesan!");
            } else {
                System.out.println("Invalid input!");
            }
        } while (kamar != 1 && kamar != 2);
        
        //input data penyewa

        System.out.println("\n==== Data Penyewa ====");
        input.nextLine();
        System.out.print("Masukan Nama Penyewa: ");
        String Penyewa = input.nextLine();
        System.out.print("Masukan No Telepon: ");
        String hp = input.nextLine();
        System.out.print("Masukan No Ktp: ");
        String ktp = input.nextLine();
        System.out.print("Masukan Email: ");
        email = input.nextLine();
        D.setPenyewa(Penyewa, email, hp, ktp);
        
        System.out.print("\nMasukan Durasi Hari Menginap (Permalam): ");
        hri = input.nextInt();

        System.out.println("Total Harga yang harus di bayar: " + total(hrga, hri));

        //Pembayaran (Cash or Transfer)

        do {
            System.out.println("\n==== Pilih Metode Pembayaran ====");
            System.out.println("1. Cash");
            System.out.println("2. Transfer");
            System.out.print("Pilihan (1-2): ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                cash bayarCash = new cash(D.getPenyewa(), total(hrga, hri));
                do {
                    System.out.print("Masukan Nominal Uang: ");
                    bayar = input.nextDouble();
                    bayarCash.prosesCash(bayar);
                } while (bayar < total(hrga, hri));
            } else if (pilihan == 2) {
                transfer bayarTransfer = new transfer(D.getPenyewa(), total(hrga, hri));
                bayarTransfer.namaPemilik();
                bayarTransfer.aset();
                do {
                    System.out.print("Masukan Nominal Transfer: ");
                    bayar = input.nextDouble();
                    bayarTransfer.prosesTransfer(bayar);
                } while (bayar != total(hrga, hri));
            } else {
                System.out.println("Invalid input!");
            }
        } while (pilihan != 1 && pilihan != 2);

        
        //Informasi Penyewa
        System.out.println("\n==== Detail Penyewaan ==== ");
        System.out.println("Nama penyewa: " + D.getPenyewa());
        System.out.println("No Telp: " + D.gethp());
        System.out.println("No Ktp: " + D.getktp());
        System.out.println("Email: " + D.getEmail());
        System.out.println("Durasi Menginap: " + hri + " Hari");
        System.out.println("============================");

        input.close();
    }
}