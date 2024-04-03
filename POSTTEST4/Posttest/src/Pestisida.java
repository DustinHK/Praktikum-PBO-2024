public class Pestisida {

    private String nama;
    protected String bentukFisik;
    private String golongan;
    private String jenis;
    private String target;

    Pestisida(String nama, String bentukFisik, String golongan, String jenis) {
        this.nama = nama;
        this.bentukFisik = bentukFisik;
        this.golongan = golongan;
        this.jenis = jenis;
    }

    protected String getBentukFisik() {
        return bentukFisik;
    }

    protected void setBentukFisik(String bentukFisik) {
        this.bentukFisik = bentukFisik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }


    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
