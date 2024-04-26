public abstract class Pestisida {
    private final String nama;
    protected String bentukFisik;
    private final String golongan;
    private final String jenis;
    private String target;

    public Pestisida(String nama, String bentukFisik, String golongan, String jenis) {
        this.nama = nama;
        this.bentukFisik = bentukFisik;
        this.golongan = golongan;
        this.jenis = jenis;
    }

    protected abstract void display();

    protected String getBentukFisik() {
        return bentukFisik;
    }

    protected void setBentukFisik(String bentukFisik) {
        this.bentukFisik = bentukFisik;
    }

    public final String getNama() {
        return nama;
    }

    public final String getGolongan() {
        return golongan;
    }

    public final String getJenis() {
        return jenis;
    }

    public final String getTarget() {
        return target;
    }

    public final void setTarget(String target) {
        this.target = target;
    }
}
