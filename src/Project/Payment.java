package Project;

class payment{
    protected String pemilik;
    protected double pembayaran;

    payment (String pemilik, double pembayaran){
        this.pemilik = pemilik;
        this.pembayaran = pembayaran;
    }

    void namaPemilik(){
        System.out.println("Nama Pemilik: "+ pemilik);
    }
}