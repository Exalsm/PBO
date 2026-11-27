//Multilevel
package pertemuan8.Quiz1;
public class employe {
    private String nama;
    private String gaji;
    private String jam_kerja;

    public employe(String nama,String gaji, String jam_kerja){
        this.nama = nama;
        this.gaji = gaji;
        this.jam_kerja =jam_kerja;

    }
    public void tampil(){
        System.out.println("Nama Karyawan: "+ nama);
        System.out.println("Gaji Karyawan: "+ gaji);
        System.out.println("Jam Kerja: "+ jam_kerja);
    }
}


