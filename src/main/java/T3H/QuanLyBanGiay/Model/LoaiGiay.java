package T3H.QuanLyBanGiay.Model;

public class LoaiGiay {
    String MaLoaiGiay;
    String TenLoaiGiay;

    public LoaiGiay() {
    }

    public LoaiGiay(String maLoaiGiay, String tenLoaiGiay) {
        MaLoaiGiay = maLoaiGiay;
        TenLoaiGiay = tenLoaiGiay;
    }

    public String getMaLoaiGiay() {
        return MaLoaiGiay;
    }

    public void setMaLoaiGiay(String maLoaiGiay) {
        MaLoaiGiay = maLoaiGiay;
    }

    public String getTenLoaiGiay() {
        return TenLoaiGiay;
    }

    public void setTenLoaiGiay(String tenLoaiGiay) {
        TenLoaiGiay = tenLoaiGiay;
    }
}
