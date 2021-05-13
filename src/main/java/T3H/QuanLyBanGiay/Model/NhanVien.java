package T3H.QuanLyBanGiay.Model;

public class NhanVien {
    String MaNV;
    String HoTen;
    String NgatSinh;
    String GioiTinh;
    String QueQuan;
    String SDT;
    String DiaChi;
    String Email;
    String NgayVaoLam;
    int Luong;
    String ChucVu;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, String ngatSinh, String gioiTinh, String queQuan, String SDT, String diaChi, String email, String ngayVaoLam, int luong, String chucVu) {
        MaNV = maNV;
        HoTen = hoTen;
        NgatSinh = ngatSinh;
        GioiTinh = gioiTinh;
        QueQuan = queQuan;
        this.SDT = SDT;
        DiaChi = diaChi;
        Email = email;
        NgayVaoLam = ngayVaoLam;
        Luong = luong;
        ChucVu = chucVu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getNgatSinh() {
        return NgatSinh;
    }

    public void setNgatSinh(String ngatSinh) {
        NgatSinh = ngatSinh;
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

    public String getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        NgayVaoLam = ngayVaoLam;
    }

    public int getLuong() {
        return Luong;
    }

    public void setLuong(int luong) {
        Luong = luong;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String chucVu) {
        ChucVu = chucVu;
    }
}
