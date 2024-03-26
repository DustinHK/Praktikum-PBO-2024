public class Fungisida extends Pestisida {
    private String jenis = "Fungisida";
    private String target;

    public Fungisida(String nama, String bentukFisik, String golongan, String jenis, String target) {
        super(nama, bentukFisik, golongan);
        this.jenis = jenis;
        this.target = target;
    }

    public void setTargetPestisida(String target) {
        this.target = target;
    }

    public String getTargetPestisida() {
        return target;
    }

    public String getJenis() {
        return jenis;
    }

    public void display() {
        System.out.printf("|\t%-20s  ", this.nama);
        System.out.printf("|\t%-20s   ", this.jenis);
        System.out.printf("|\t%-20s    ", this.target);
        System.out.printf("|\t%-20s   ", this.bentukFisik);
        System.out.printf("|\t%-20s   ", this.golongan);
        System.out.println("\n");
    }
}
