public class MenuItem {
    private String nama;
    private String deskripsi;
    private int harga;
    private int gambar;

    public MenuItem(String nama, String deskripsi, int harga, int gambar) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.gambar = gambar;
    }

    public String getNama() { return nama; }
    public String getDeskripsi() { return deskripsi; }
    public int getHarga() { return harga; }
    public int getGambar() { return gambar; }
}
