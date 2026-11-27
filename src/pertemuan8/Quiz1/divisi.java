package pertemuan8.Quiz1;

class divisi extends posisi {
    private String tempat;
    
    public divisi (String jabatan, String nama, String tempat, String jam_kerja, String gaji){
        super(nama, gaji, jabatan, jam_kerja);
        this.tempat = tempat;
    }

     public void tampil(){
        super.tampil();
        System.out.println("Ada Di Divisi: "+ tempat);
    }
}
