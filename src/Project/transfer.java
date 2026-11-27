package Project;

class transfer extends payment {
    private double saldo = 5000000;

    transfer(String pemilik, double pembayaran) {
        super(pemilik, pembayaran);
    }

    void aset() {
        System.out.println("Saldo Anda: " + saldo);
    }

    void prosesTransfer(double uang) {
        if (uang > pembayaran) {
            System.out.println("\nNominal Transfer Anda lebih, Silahkan Memasukan Jumlah nominal yang pas!");
        } else if (uang < pembayaran) {
            System.out.println("\nNominal Transfer Anda kurang, Silahkan Memasukan Jumlah nominal yang pas!");
        } else {
            if (saldo >= pembayaran) {
                saldo -= pembayaran;
                System.out.println("\nTransfer Berhasil!");
                System.out.println("Sisa Saldo Anda: " + saldo);
            } else {
                System.out.println("\nSaldo Anda tidak mencukupi!");
            }
        }
    }
}
