//Parent
package pertemuan8.Quiz2;

class fruit {
    private String nama;
    private String bentuk;

    public fruit(String nama, String bentuk){
        this.nama = nama;
        this.bentuk = bentuk;
    }
    public void tampil (){
        System.out.println("Nama: " + nama);
        System.out.println("Bentuk: " + bentuk);
    }
}
