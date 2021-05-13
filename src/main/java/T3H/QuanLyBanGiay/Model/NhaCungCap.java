package T3H.QuanLyBanGiay.Model;

public class NhaCungCap {
    String MaNCC;
    String TenNCC;
    String DiaChi;
    String SDT;
    String Email;
    String Fax;
    String TruSo;

    public NhaCungCap() {
    }

    public NhaCungCap(String maNCC, String tenNCC, String diaChi, String SDT, String email, String fax, String truSo) {
        MaNCC = maNCC;
        TenNCC = tenNCC;
        DiaChi = diaChi;
        this.SDT = SDT;
        Email = email;
        Fax = fax;
        TruSo = truSo;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String maNCC) {
        MaNCC = maNCC;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC(String tenNCC) {
        TenNCC = tenNCC;
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
