public class Fungisida extends Pestisida {
    private final String jenis = "Fungisida";

    public Fungisida(String nama, String bentukFisik, String golongan, String jenis) {
        super(nama, bentukFisik, golongan, jenis);
    }

    @Override
    protected void display() {
        super.display();
        System.out.println("Spesifik: " + Spesifik);}}
       
