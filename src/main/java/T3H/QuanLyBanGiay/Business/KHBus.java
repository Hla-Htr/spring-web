package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.Model.KhachHang;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KHBus extends BaseBus implements IBus<KhachHang> {
    @Override
    public List<KhachHang> getAll() {
        List<KhachHang> list = new ArrayList<>();
        query = "Select * From KhachHang";

        ResultSet resultSet = db.getTable(query,parameters);
        try {
            while (resultSet.next())
            {
                list.add(new InitInfor().initKH(resultSet));
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        clear();
        return list;
    }

    @Override
    public KhachHang getSingleByID(String id) {
        query = "select * from KhachHang where MaKH = ?";
        parameters.add(id);

        ResultSet resultSet = db.getTable(query,parameters);
        KhachHang kh = new InitInfor().initKH(resultSet);
        clear();
        return kh;
    }

    @Override
    public List<KhachHang> getByKeyword(String keyword){
        List<KhachHang> list = new ArrayList<>();
        query = "select * from KhachHang where HoTen like '%?%'";
        parameters.add(keyword);
        ResultSet resultSet = db.getTable(query,parameters);
        try {
            while (resultSet.next())
            {
                list.add(new InitInfor().initKH(resultSet));
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        clear();
        return null;
    }

    @Override
    public void add(KhachHang info) {
        query = "Insert into KhachHang values (?,?,?,?,?,?,?,?,?)";
        parameters.add(info.getMaKH());
        parameters.add(info.getHoTen());
        parameters.add(info.getNgaySinh());
        parameters.add(info.getGioiTinh());
        parameters.add(info.getQueQuan());
        parameters.add(info.getSDT());
        parameters.add(info.getDiaChi());
        parameters.add(info.getEmail());
        parameters.add(String.valueOf(info.getTongTienTT()));

        db.executeQuery(query,parameters);
        clear();
    }

    @Override
    public void edit(KhachHang info) {
        query = "Update KhachHang set HoTen = ?, NgaySinh = ?, GioiTinh = ?, QueQuan = ?, SDT = ?, DiaChi = ?, EMail = ?,TongTienTT = ? where MaKH =?";
        parameters.add(info.getHoTen());
        parameters.add(info.getNgaySinh());
        parameters.add(info.getGioiTinh());
        parameters.add(info.getQueQuan());
        parameters.add(info.getSDT());
        parameters.add(info.getDiaChi());
        parameters.add(info.getEmail());
        parameters.add(String.valueOf(info.getTongTienTT()));
        parameters.add(info.getMaKH());


        db.executeQuery(query,parameters);
        clear();
    }

    @Override
    public void delete(String id) {
        query = "delete from KhachHang where MaKH = ?";
        parameters.add(id);

        db.executeQuery(query,parameters);
        clear();
    }
}
