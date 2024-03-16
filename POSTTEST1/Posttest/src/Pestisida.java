public class Pestisida {

    private String nama;
    private String jenis;
    private String bentukFisik;
    private String golongan;

    Pestisida(String nama, String jenis, String bentukFisik, String golongan) {
        this.nama = nama;
        this.jenis = jenis;
        this.bentukFisik = bentukFisik;
        this.golongan = golongan;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getBentukFisik() {
        return bentukFisik;
    }

    public void setBentukFisik(String bentukFisik) {
        this.bentukFisik = bentukFisik;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }
}



