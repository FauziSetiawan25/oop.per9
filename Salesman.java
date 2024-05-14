package pertemuan9;

public class Salesman extends Pegawai{
    private int target, penjualan;
    public Salesman(String nama, String departemen, char jenisKelamin){
        super(nama, departemen, jenisKelamin);
    }
    public void setTarget(int target) {
        this.target = target;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public void displayInfo(){
        System.out.println("Jabatan : Salesman");
        System.out.println("Nama : " + getNama());
        System.out.println("Departemen : " + getDepartemen());
        System.out.println("NIP : " + getNip());
        System.out.println("Gaji : " + getGaji());
        if(penjualan >= target){
            System.out.println("Gaji : " + (getGaji()*2));
        }else {
            System.out.println("Gaji : " + getGaji());
        }
        System.out.println("Cuti : " + getCuti());
    }
}
