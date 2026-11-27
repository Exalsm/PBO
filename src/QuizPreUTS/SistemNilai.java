package QuizPreUTS;
import java.util.Scanner;
class mahasiswa {
    private int nim;
    private String nama;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;

    mahasiswa(int nim, String nama, double nilaiTugas, double nilaiUts, double nilaiUas){
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas =nilaiTugas;
        this.nilaiUts =nilaiUts;
        this.nilaiUas = nilaiUas;
    }
    public void setData(int nim, String nama, double nilaiTugas, double nilaiUts, double nilaiUas){
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas =nilaiTugas;
        this.nilaiUts =nilaiUts;
        this.nilaiUas = nilaiUas;
    }
    public String getNama(){
        return nama;
    }

    public int getNim(){
        return nim;
    }

    public double getTugas(){
        return nilaiTugas;
    }

    public double getUts(){
        return nilaiUts;
    }

    public double getUas(){
        return nilaiUas;
    }
    
    double Nilaiakhir(){
        return (nilaiTugas * 0.3) + (nilaiUts * 0.3) + (nilaiUas * 0.3); 
    }

    void validasiTugas(){
        if (nilaiTugas >=100 && nilaiTugas <= 0 ){
            System.out.print("");
        }else {
            System.out.print("Input Tidak Valid");
        }
    }
     void validasiuts(){
        if (nilaiUts >=100 && nilaiUts <= 0 ){
            System.out.print("");
        }else {
            System.out.print("Input Tidak Valid");
        }
    }
     void validasiuas(){
        if (nilaiUas >=100 && nilaiUas <= 0 ){
            System.out.print("");
        }else {
            System.out.print("Input Tidak Valid");
        }
    }
    void lulus(){
        if (Nilaiakhir() >= 60){
            System.out.println("Anda Lulus");
        }else{
            System.out.println("Anda Gagal");
        }
    }
}
public class SistemNilai {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nim Mahasiswa: ");
        int nim = input.nextInt();
        System.out.print("Masukan Nama Mahasiswa: ");
        input.nextLine();

        String Nama= input.nextLine();
        System.out.print("Masukan Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukan Nilai UTS: ");
        double nilaiUts = input.nextDouble();
        System.out.print("Masukan Nilai UAS: ");
        double nilaiUas = input.nextDouble();
        mahasiswa mhs = new mahasiswa (nim, Nama,nilaiTugas, nilaiUts,nilaiUas );
        mhs.setData(nim, Nama,nilaiTugas, nilaiUts,nilaiUas);


        System.out.println("\n==== Hasil penilaian Mahasiswa ====");
        System.out.println("NIM             = " + mhs.getNim());
        System.out.println("Nama            = " + mhs.getNama());
        System.out.println("Nilai Tugas     = " + mhs.getTugas());
        System.out.println("Nilai UTS       = " + mhs.getUts());
        System.out.println("Nilai Uas       = " + mhs.getUas());
        System.out.println("Nilai Akhir     = " + mhs.Nilaiakhir());
        System.out.print  ("Status          = ");
        mhs.lulus();
    }
}
