package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.Model.NhanVien;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NVBus extends BaseBus implements IBus<NhanVien> {
    @Override
    public List<NhanVien> getAll() {
        List<NhanVien> list = new ArrayList<>();
        query = "Select * from NhanVien";
        ResultSet resultSet = db.getTable(query,parameters);
        try{
            while (resultSet.next())
            {
                list.add(new InitInfor().initNV(resultSet));
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public NhanVien getSingleByID(String id) {
        query = "Select * from NhanVien where MaNV = ?";
        parameters.add(id);

        ResultSet resultSet = db.getTable(query,parameters);
        NhanVien nv = new InitInfor().initNV(resultSet);

        return nv;
    }

    @Override
    public List<NhanVien> getByKeyword(String keyword) throws SQLException {
        List<NhanVien> list = new ArrayList<>();
        query = "Select * From NhanVien where HoTen like '%?%'";
        parameters.add(keyword);
        ResultSet resultSet = db.getTable(query,parameters);
        while (resultSet.next())
        {
            list.add(new InitInfor().initNV(resultSet));
        }
        return list;
    }

    @Override
    public void add(NhanVien info) {
        query = "insert into NhanVien values (?,?,?,?,?,?,?,?,?,?,?) ";
        parameters.add(info.getMaNV());
        parameters.add(info.getHoTen());
        parameters.add(info.getNgatSinh());
        parameters.add(info.getGioiTinh());
        parameters.add(info.getQueQuan());
        parameters.add(info.getSDT());
        parameters.add(info.getDiaChi());
        parameters.add(info.getEmail());
        parameters.add(info.getNgayVaoLam());
        parameters.add(String.valueOf(info.getLuong()));
        parameters.add(info.getChucVu());

        db.executeQuery(query,parameters);
    }

    @Override
    public void edit(NhanVien info) {
        query = "update NhanVien set HoTen = ?,NgaySinh = ?,GioiTinh = ?,QueQuan = ?,SDT = ?,DiaChi = ?,EMail = ?,NgayVaoLam = ?,Luong = ?,ChucVu = ? where MaNV = ?";
        parameters.add(info.getHoTen());
        parameters.add(info.getNgatSinh());
        parameters.add(info.getGioiTinh());
        parameters.add(info.getQueQuan());
        parameters.add(info.getSDT());
        parameters.add(info.getDiaChi());
        parameters.add(info.getEmail());
        parameters.add(info.getNgayVaoLam());
        parameters.add(String.valueOf(info.getLuong()));
        parameters.add(info.getChucVu());
        parameters.add(info.getMaNV());

        db.executeQuery(query,parameters);
    }

    @Override
    public void delete(String id) {
        query = "Delete from NhanVien where MaNV = ?";
        parameters.add(id);

        db.executeQuery(query,parameters);
    }
}
