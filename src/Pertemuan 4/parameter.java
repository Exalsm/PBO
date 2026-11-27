import java.util.Scanner;

public class parameter {
    
    public static void mahasiswa(String nama, int NIM){
        System.out.print("Mahasiswa Bernama: " + nama + " Memiliki NIM: " + NIM);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama;
        int nim;
        System.out.print("Masukan Nama Mahasiswa: ");
        nama = input.nextLine();
        System.out.print("Masukan NIM Mahasiswa: ");
        nim = input.nextInt();

        mahasiswa(nama,nim);
        input.close();
    }
}
