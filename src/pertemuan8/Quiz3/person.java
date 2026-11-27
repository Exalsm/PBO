package pertemuan8.Quiz3;
//parent
class person {
    //mahasiswa = nama, nim, angkatan
    private String nama;
    private String nim;
    private int angkatan;

    public person (String nama, String nim, int angkatan){
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;
    }
    public void hasil(){
        System.out.println("Nama Mahasiswa  : " + nama);
        System.out.println("NIM Mahasiswa   : " + nim);
        System.out.println("Angkatan        : " + angkatan);
    }
}