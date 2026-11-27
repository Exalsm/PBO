package pertemuan8.Quiz2;

public class warna extends fruit {
    private String warna;

    public warna(String nama, String bentuk, String warna) {
        super(nama, bentuk);
        this.warna = warna;
    }

    public void tampil() {
        super.tampil();
        System.out.println("Berwarna: " + warna);
    }
}