package pertemuan8.Quiz1;

class posisi extends employe {
   private String jabatan;

   public posisi (String nama, String gaji, String jabatan, String jam_kerja){
        super (nama, jam_kerja, gaji);
        this.jabatan = jabatan;
   }
   public void tampil(){
      super.tampil();
    System.out.println("Memiliki Jabatan: "+ jabatan);
   }
}
