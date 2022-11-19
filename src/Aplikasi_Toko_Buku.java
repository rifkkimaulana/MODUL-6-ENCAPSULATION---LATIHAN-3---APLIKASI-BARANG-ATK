/**
 *
 * @author Rifki Maulana
 */

class Aplikasi_Toko_Buku {
    private String barang, kodeBarang;
    private int stok, jumlahJual;
    private long hargaJual, hpp;
    
    // Input Barang
    public void inputBarang(String barang) {
        this.barang = barang;
    }
    // Input Kode Barang
    public void inputKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }
    // Input Stok Barang
    public void inputStok (int stok) {
        this.stok = stok;
    }
    // Input Jumlah Jual Barang
    public void inputJumlahJual(int jumlahJual) {
        this.jumlahJual = jumlahJual;
    }
    // Input Harga Jual Barang
    public void inputHarga (long hargaJual) {
        this.hargaJual = hargaJual;
    }
    // Input HPP
    public void inputHpp (long hpp) {
        this.hpp = hpp;
    }
    
    // Tampil Barang
    public String tampilBarang() {
        return barang;
    }
    // Tampil Kode Barang
    public String tampilKodeBarang () {
        return kodeBarang;
    }
    // Tampil Stok Barang
    public int tampilStok() {
        return stok;
    }
    // Tampil Jumlah jual
    public int tampilJumlahJual() {
        return jumlahJual;
    }
    // Tampil Harga HPP
    public long tampilHpp() {
        return hpp;
    }
    // Tampil Harga Jual
    public long tampilHargaJual() {
        return hargaJual;
    }

public static void main(String args []) {
Aplikasi_Toko_Buku toko = new Aplikasi_Toko_Buku();

toko.inputBarang("BUKU GAMBAR");
toko.inputKodeBarang("B001");
toko.inputHpp(2500);
toko.inputHarga(3000);
toko.inputStok(5);
toko.inputJumlahJual(2);

int a = toko.tampilStok();
int b = toko.tampilJumlahJual();
int stokSekarang = a-b;

long c = toko.tampilHpp();
long d = toko.tampilHargaJual();
long laba = toko.tampilHargaJual()*toko.tampilJumlahJual()-toko.tampilHpp()*toko.tampilJumlahJual() ;






System.out.println("INPUT : ");
System.out.println("Kode Barang : " + toko.tampilKodeBarang());
System.out.println("Nama Barang : " + toko.tampilBarang());
System.out.println("HPP         : " + toko.tampilHpp());
System.out.println("Harga Jual  : " + toko.tampilHargaJual());
System.out.println("Stok        : " + toko.tampilStok());
System.out.println("Jumlah Jual : " + toko.tampilJumlahJual());
System.out.println("OUTPUT:");
//System.out.println("Stok Sekarang : " + toko.tampilStok());
System.out.println("Stok Sekarang : " + stokSekarang);
System.out.println("Total Bayar   : " + toko.tampilHargaJual()* toko.tampilJumlahJual());
System.out.println("Laba          : " + laba );


}

}