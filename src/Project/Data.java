package Project;

class Data{//enkapsulasi
    private String namaPenyewa;
    private String noHp;
    private String ktp;
    private String email;
    
    //Call frame - reference variable
    public Data(String namaPenyewa, String email, String noHp, String ktp){ //Construktor
        this.namaPenyewa = namaPenyewa;
        this.email = email;
        this.noHp = noHp;
        this.ktp = ktp;
    }
    //typical calling sequence
    public void setPenyewa(String namaPenyewa, String email, String noHp, String ktp){ //Setter
        this.namaPenyewa = namaPenyewa;
        this.email = email;
        this.noHp = noHp;
        this.ktp = ktp;
    }
    public String getPenyewa(){ //Getter
        return namaPenyewa;
    }
    
    public String gethp(){//getter
        return noHp;
    }
    public String getktp(){//Getter
        return ktp;
    }
    public String getEmail(){//Getter
        return email;
    }
}

