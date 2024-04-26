package pestisida;

public class Insektisida extends Pestisida {
    private final String jenis = "Insektisida";

    public Insektisida(String nama, String bentukFisik, String golongan, String jenis) {
        super(nama, bentukFisik, golongan, jenis);
    }

    @Override
    protected void display() {
        super.display();
        System.out.println("Spesifik: " + Spesifik);}}
       
