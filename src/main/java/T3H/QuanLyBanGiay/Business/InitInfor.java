package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.Model.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InitInfor {
    public Giay initShoe(ResultSet resultSet)  {
        Giay shoe = new Giay();

        try {
            shoe.setMaGiay(resultSet.getString("MaGiay"));
            shoe.setTenGiay(resultSet.getString("TenGiay"));
            shoe.setSize(resultSet.getInt("Size"));
            shoe.setSoLuong(resultSet.getInt("SoLuong"));
            shoe.setGia(resultSet.getInt("Gia"));
            shoe.setMaLG(resultSet.getString("MaLG"));
            shoe.setMaNSX(resultSet.getString("MaNSX"));
            shoe.setAnh(resultSet.getString("Anh"));
            shoe.setMoTa(resultSet.getString("MoTa"));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return shoe;
    }

    public KhachHang initKH(ResultSet resultSet)  {
        KhachHang kh = new KhachHang();

        try {
            kh.setMaKH(resultSet.getString("MaKH"));
            kh.setHoTen(resultSet.getString("HoTen"));
            kh.setNgaySinh(resultSet.getString("NgaySinh"));
            kh.setGioiTinh(resultSet.getString("GioiTinh"));
            kh.setQueQuan(resultSet.getString("QueQuan"));
            kh.setSDT(resultSet.getString("SDT"));
            kh.setDiaChi(resultSet.getString("DiaChi"));
            kh.setEmail(resultSet.getString("EMail"));
            kh.setTongTienTT(resultSet.getInt("TongTienTT"));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return kh;
    }
    public LoaiGiay initLoaiGiay(ResultSet resultSet)  {
        LoaiGiay shoe = new LoaiGiay();

        try {
            shoe.setMaLoaiGiay(resultSet.getString("MaLG"));
            shoe.setTenLoaiGiay(resultSet.getString("TenLG"));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return shoe;
    }
    public NhaCungCap initNCC(ResultSet resultSet)  {
        NhaCungCap nhaCungCap = new NhaCungCap();

        try {
            nhaCungCap.setMaNCC(resultSet.getString("MaNCC"));
            nhaCungCap.setTenNCC(resultSet.getString("TenNCC"));
            nhaCungCap.setDiaChi(resultSet.getString("DiaChi"));
            nhaCungCap.setSDT(resultSet.getString("SDT"));
            nhaCungCap.setEmail(resultSet.getString("EMail"));
            nhaCungCap.setFax(resultSet.getString("Fax"));
            nhaCungCap.setTruSo(resultSet.getString("TruSo"));

        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return nhaCungCap;
    }
    public NhanVien initNV(ResultSet resultSet)  {
        NhanVien nhanVien = new NhanVien();

        try {
            nhanVien.setMaNV(resultSet.getString("MaNV"));
            nhanVien.setHoTen(resultSet.getString("HoTen"));
            nhanVien.setNgatSinh(resultSet.getString("NgaySinh"));
            nhanVien.setGioiTinh(resultSet.getString("GioiTinh"));
            nhanVien.setQueQuan(resultSet.getString("QueQuan"));
            nhanVien.setSDT(resultSet.getString("SDT"));
            nhanVien.setDiaChi(resultSet.getString("DiaChi"));
            nhanVien.setEmail(resultSet.getString("EMail"));
            nhanVien.setNgayVaoLam(resultSet.getString("NgayVaoLam"));
            nhanVien.setLuong(resultSet.getInt("Luong"));
            nhanVien.setChucVu(resultSet.getString("ChucVu"));
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return nhanVien;
    }
    public NhaSanXuat initNSX(ResultSet resultSet)  {
        NhaSanXuat nhaSanXuat = new NhaSanXuat();

        try {
            nhaSanXuat.setMaNSX(resultSet.getString("MaNSX"));
            nhaSanXuat.setTenNSX(resultSet.getString("TenNSX"));
            nhaSanXuat.setDiaChi(resultSet.getString("DiaChi"));
            nhaSanXuat.setSDT(resultSet.getString("SDT"));
            nhaSanXuat.setEmail(resultSet.getString("EMail"));
            nhaSanXuat.setFax(resultSet.getString("Fax"));
            nhaSanXuat.setTruSo(resultSet.getString("TruSo"));

        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return nhaSanXuat;
    }
    public PhieuNhap initPN(ResultSet resultSet)  {
        PhieuNhap phieuNhap = new PhieuNhap();

        try {
            phieuNhap.setMaPN(resultSet.getString("MaPN"));
            phieuNhap.setNgayNhap(resultSet.getString("NgayNhap"));
            phieuNhap.setMaNV(resultSet.getString("MaNV"));
            phieuNhap.setMaNCC(resultSet.getString("MaNCC"));
            phieuNhap.setTongTien(resultSet.getInt("TongTien"));

        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return phieuNhap;
    }
    public PhieuXuat initPX(ResultSet resultSet)  {
        PhieuXuat phieuXuat = new PhieuXuat();

        try {
            phieuXuat.setMaPX(resultSet.getString("MaPX"));
            phieuXuat.setNgayXuat(resultSet.getString("NgayXuat"));
            phieuXuat.setMaKH(resultSet.getString("MaNV"));
            phieuXuat.setMaKH(resultSet.getString("MaKH"));
            phieuXuat.setTongtien(resultSet.getInt("TongTien"));

        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return phieuXuat;
    }
    public CT_PhieuNhap initCTPN(ResultSet resultSet)  {
        CT_PhieuNhap ctPhieuNhap = new CT_PhieuNhap();

        try {
            ctPhieuNhap.setMaPN(resultSet.getString("MaPN"));
            ctPhieuNhap.setMaGiay(resultSet.getString("MaGiay"));
            ctPhieuNhap.setSoLuong(resultSet.getInt("SoLuong"));
            ctPhieuNhap.setGia(resultSet.getInt("Gia"));

        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return ctPhieuNhap;
    }
    public CT_PhieuXuat initCTPX(ResultSet resultSet)  {
        CT_PhieuXuat ctPhieuXuat = new CT_PhieuXuat();

        try {
            ctPhieuXuat.setMaPX(resultSet.getString("MaPX"));
            ctPhieuXuat.setMaGiay(resultSet.getString("MaGiay"));
            ctPhieuXuat.setSoLuong(resultSet.getInt("SoLuong"));
            ctPhieuXuat.setGia(resultSet.getInt("Gia"));

        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return ctPhieuXuat;
    }


}
