package pertemuan8.Quiz3;
//child1
class matkul extends person{
    //Matakuliah = nama, jam
    private String namaMatkul;
    private String jam;

    public matkul(String nama, String nim, int angkatan, String namaMatkul, String jam ){
        super(nama,nim,angkatan);
        this.namaMatkul = namaMatkul;
        this.jam = jam;
    }
    public void hasilPerson (){
        hasil();
        System.out.println("MataKuliah  : " + namaMatkul);
        System.out.println("Pada Jam    : " + jam);
    }
}  
