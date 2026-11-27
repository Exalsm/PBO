package QuizPreUTS;
import java.util.Scanner;
class Buku{
    String judul;
    String penulis;
    int TahunTerbit;
    
    public Buku (String judul,String penulis, int TahunTerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.TahunTerbit = TahunTerbit;
    }
    void tampilkanInfo(){
        System.out.println("Judul buku   = " + judul);
        System.out.println("Nama Penulis = " + penulis);
        System.out.println("Tahun Terbit = " + TahunTerbit);
    }
}
public class SistemBuku {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("==== Buku Ke 1 =====");
        System.out.print("Masukan Judul: ");
        String judul = input.nextLine();
        System.out.print("Nama Penulis: ");
        String penulis = input.nextLine();
        System.out.print("Tahun Terbit: ");
        int TahunTerbit =input.nextInt();
        
        Buku a = new Buku(judul, penulis, TahunTerbit);
        System.out.println("\n==== Buku Ke 2 =====");
        System.out.print("Masukan Judul: ");
        input.nextLine();
        String judul2 = input.nextLine();
        System.out.print("Nama Penulis: ");
        String penulis2 = input.nextLine();
        System.out.print("Tahun terbit: ");
        int TahunTerbit2 =input.nextInt();
        Buku b = new Buku(judul2, penulis2, TahunTerbit2);
        
        System.out.println("\n====== Data Buku ======");
        System.out.println("===== Data Buku 1 =====");
        a.tampilkanInfo();
        System.out.println("\n===== Data Buku 2 =====");
        b.tampilkanInfo();

    }
}

