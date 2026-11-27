package pertemuan8.Quiz2;

class jenis extends fruit {
    private String macam;

    public jenis(String nama, String bentuk, String macam) {
        super(nama, bentuk);
        this.macam = macam;
    }

    public void tampil() {
        super.tampil();
        System.out.println("Berjenis: " + macam);
    }
}