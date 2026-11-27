package pertemuan8.Quiz3;

class fulldata extends dosen implements semester {
    private matkul mk;

    public fulldata(String nama, String nim, int angkatan, String namaDosen, String nidn, String namaMatkul, String jam) {
        super(nama, nim, angkatan, namaDosen, nidn);
        this.mk = new matkul(nama, nim, angkatan, namaMatkul, jam);
    }

    public void hasildata() {
       System.out.println("===== Data 1 =====");
        hasildosen();     
        System.out.println("===== Data 2 =====");
        mk.hasilPerson(); 
    }

    @Override
    public void semester(String semester) {
        System.out.println("Semester        : " + semester);
    }

    public static void main(String[] args) {
        fulldata data = new fulldata("Exsel Ramadhan","20250801031",2025,
            "Budiono","8090","Matematika Diskrit","08:00 - 10:00"
        );
        data.hasildata();
        data.semester("Genap");
    }
}