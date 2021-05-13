package T3H.QuanLyBanGiay.Model;

public class Giay {
    String MaGiay;
    String TenGiay;
    int Size;
    String Mau;
    int SoLuong;
    int Gia;
    String MaLG;
    String MaNSX;
    String Anh;
    String MoTa;

    public Giay(String maGiay, String tenGiay, int size, String mau, int soLuong, int gia, String maLG, String maNSX, String anh, String moTa) {
        MaGiay = maGiay;
        TenGiay = tenGiay;
        Size = size;
        Mau = mau;
        SoLuong = soLuong;
        Gia = gia;
        MaLG = maLG;
        MaNSX = maNSX;
        Anh = anh;
        MoTa = moTa;
    }

    public Giay() {
    }

    public String getMaGiay() {
        return MaGiay;
    }

    public void setMaGiay(String maGiay) {
        MaGiay = maGiay;
    }

    public String getTenGiay() {
        return TenGiay;
    }

    public void setTenGiay(String tenGiay) {
        TenGiay = tenGiay;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public String getMau() {
        return Mau;
    }

    public void setMau(String mau) {
        Mau = mau;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    public String getMaLG() {
        return MaLG;
    }

    public void setMaLG(String maLG) {
        MaLG = maLG;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String maNSX) {
        MaNSX = maNSX;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String anh) {
        Anh = anh;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }
}
