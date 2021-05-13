package T3H.QuanLyBanGiay.Model;

public class PhieuXuat {
    String MaPX;
    String NgayXuat;
    String MaNV;
    String MaKH;
    int Tongtien;

    public PhieuXuat() {
    }

    public PhieuXuat(String maPX, String ngayXuat, String maNV, String maKH, int tongtien) {
        MaPX = maPX;
        NgayXuat = ngayXuat;
        MaNV = maNV;
        MaKH = maKH;
        Tongtien = tongtien;
    }

    public String getMaPX() {
        return MaPX;
    }

    public void setMaPX(String maPX) {
        MaPX = maPX;
    }

    public String getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        NgayXuat = ngayXuat;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public int getTongtien() {
        return Tongtien;
    }

    public void setTongtien(int tongtien) {
        Tongtien = tongtien;
    }
}
