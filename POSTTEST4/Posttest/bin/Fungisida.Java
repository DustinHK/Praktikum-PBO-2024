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

    public void display(String spesifik) {
        super.display();
        System.out.println("Spesifik: " + Spesifik);
    }
}

