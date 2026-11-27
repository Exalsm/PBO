package Project;

class cash extends payment {
    cash(String pemilik, double pembayaran) {
        super(pemilik, pembayaran);
    }

    void prosesCash(double uang) {
        if (uang > pembayaran) {
            double kembalian = uang - pembayaran;
            System.out.println("\nUang nya lebih");
            System.out.println("Total Kembalian: " + kembalian);
        } else if (uang < pembayaran) {
            System.out.println("\nUang nya kurang kak");
        } else {
            System.out.println("\nUang Anda Pas");
        }
    }
}
