package pertemuan8.Quiz2;

public class main {
    public void main (String[] args){
        jenis j = new jenis("Jeruk", "bulat", "Genus Citrus");
        warna w = new warna("apel", "bulat","Merah");
        System.out.println("==== Buah 1 ====");
        j.tampil();
        System.out.println("\n==== Buah 2 ====");
        w.tampil();
    }
    
}
