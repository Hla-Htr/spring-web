package T3H.QuanLyBanGiay.Model;

public class CT_PhieuXuat {
    String MaPX;
    String MaGiay;
    int SoLuong;
    int Gia;

    public CT_PhieuXuat() {
    }

    public CT_PhieuXuat(String maPX, String maGiay, int soLuong, int gia) {
        MaPX = maPX;
        MaGiay = maGiay;
        SoLuong = soLuong;
        Gia = gia;
    }

    public String getMaPX() {
        return MaPX;
    }

    public void setMaPX(String maPX) {
        MaPX = maPX;
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
