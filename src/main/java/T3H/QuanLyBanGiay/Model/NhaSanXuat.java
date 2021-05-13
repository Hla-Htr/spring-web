package T3H.QuanLyBanGiay.Model;

public class NhaSanXuat {
    String MaNSX;
    String TenNSX;
    String DiaChi;
    String SDT;
    String Email;
    String Fax;
    String TruSo;

    public NhaSanXuat() {
    }

    public NhaSanXuat(String maNSX, String tenNSX, String diaChi, String SDT, String email, String fax, String truSo) {
        MaNSX = maNSX;
        TenNSX = tenNSX;
        DiaChi = diaChi;
        this.SDT = SDT;
        Email = email;
        Fax = fax;
        TruSo = truSo;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String maNSX) {
        MaNSX = maNSX;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String tenNSX) {
        TenNSX = tenNSX;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getTruSo() {
        return TruSo;
    }

    public void setTruSo(String truSo) {
        TruSo = truSo;
    }
}
