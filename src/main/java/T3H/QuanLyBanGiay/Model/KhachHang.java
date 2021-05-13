package T3H.QuanLyBanGiay.Model;

public class KhachHang {
    String MaKH;
    String HoTen;
    String NgaySinh;
    String GioiTinh;
    String QueQuan;
    String SDT;
    String DiaChi;
    String Email;
    int TongTienTT;

    public KhachHang() {
    }

    public KhachHang(String maKH, String hoTen, String ngaySinh, String gioiTinh, String queQuan, String SDT, String diaChi, String email, int tongTienTT) {
        MaKH = maKH;
        HoTen = hoTen;
        NgaySinh = ngaySinh;
        GioiTinh = gioiTinh;
        QueQuan = queQuan;
        this.SDT = SDT;
        DiaChi = diaChi;
        Email = email;
        TongTienTT = tongTienTT;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getTongTienTT() {
        return TongTienTT;
    }

    public void setTongTienTT(int tongTienTT) {
        TongTienTT = tongTienTT;
    }
}
