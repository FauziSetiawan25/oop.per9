import java.util.Objects;

public class Pegawai {
    private String nama,departemen,nip;
    private char jenisKelamin;
    private int gaji,cuti = 12;
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void setCuti(int cutii) {
        this.cuti = cuti + cutii;
    }
    public void setCuti(String cutii) {
        if(Objects.equals(cutii, "pernikahan")){
            this.cuti = cuti + 2; 
        } else if (Objects.equals(cutii, "persalinan")) {
            if (getJenisKelamin() == 'P'){
                this.cuti = cuti + 90;
            }else {
                this.cuti = cuti + 3;
            }
        }

    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public void setNip(int nip) {
        if(this instanceof Manager){
           this.nip = "M000" + nip;
        } else if (this instanceof  Salesman) {
            this.nip = "S000" + nip;
        }else {
            this.nip = ("P000" + nip);
        }
    }
    public String getNama() {
        return nama;
    }

    public String getDepartemen() {
        return departemen;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public int getGaji() {
        return gaji;
    }

    public int getCuti() {
        return cuti;
    }

    public String getNip() {
        return nip;
    }

    public Pegawai(String nama, String departemen, char jenisKelamin){
        this.nama = nama;
        this.departemen = departemen;
        this.jenisKelamin = jenisKelamin;
    }
    public void displayInfo(){
        System.out.println("Jabatan : Pegawai");
        System.out.println("Nama : " + getNama());
        System.out.println("Departemen : " + getDepartemen());
        System.out.println("NIP : " + getNip());
        System.out.println("Gaji : " + getGaji());
        System.out.println("Gaji : " + getGaji());
        System.out.println("Cuti : " + getCuti());
        System.out.println("=================================");
    }
}
