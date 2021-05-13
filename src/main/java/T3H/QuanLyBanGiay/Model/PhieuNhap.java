package T3H.QuanLyBanGiay.Model;

public class PhieuNhap {
    String MaPN;
    String NgayNhap;
    String MaNV;
    String MaNCC;
    int TongTien;

    public PhieuNhap() {
    }

    public PhieuNhap(String maPN, String ngayNhap, String maNV, String maNCC, int tongTien) {
        MaPN = maPN;
        NgayNhap = ngayNhap;
        MaNV = maNV;
        MaNCC = maNCC;
        TongTien = tongTien;
    }

    public String getMaPN() {
        return MaPN;
    }

    public void setMaPN(String maPN) {
        MaPN = maPN;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        NgayNhap = ngayNhap;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String maNCC) {
        MaNCC = maNCC;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int tongTien) {
        TongTien = tongTien;
    }
}
