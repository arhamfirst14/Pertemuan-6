
package inheritanche;

class Kendaraan {

    protected String jenis, merk;
    protected int harga;

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    protected void input(String jenis, String merk, int harga) {
        setJenis(jenis);
        setMerk(merk);
        setHarga(harga);
    }

    public void tampilData() {
        System.out.println("\nJenis Kendaraan : " + this.jenis);
        System.out.println("Merk kendaraan : " + this.merk);
        System.out.println("harga Kendaraan : " + this.harga);
    }
}