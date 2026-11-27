package pertemuan8.Quiz3;

//child2
class dosen extends person{
    //Dosen = nama, nidn
    private String namaDosen;
    private String nidn;
    public dosen(String nama, String nim, int angkatan,String namaDosen, String nidn){
        super(nama, nim, angkatan);
        this.namaDosen =namaDosen;
        this.nidn =nidn;
    }
    void hasildosen(){
        hasil();
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("NIDN: " + nidn);
    }
}
