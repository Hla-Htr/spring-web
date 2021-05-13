package T3H.QuanLyBanGiay.Model;

public class CT_PhieuNhap {
    String MaPN;
    String MaGiay;
    int SoLuong;
    int Gia;

    public CT_PhieuNhap() {
    }

    public CT_PhieuNhap(String maPN, String maGiay, int soLuong, int gia) {
        MaPN = maPN;
        MaGiay = maGiay;
        SoLuong = soLuong;
        Gia = gia;
    }

    public String getMaPN() {
        return MaPN;
    }

    public void setMaPN(String maPN) {
        MaPN = maPN;
    }

    public String getMaGiay() {
        return MaGiay;
    }

    public void setMaGiay(String maGiay) {
        MaGiay = maGiay;
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
}
