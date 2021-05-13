package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.Model.PhieuNhap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PNBus extends BaseBus implements IBus<PhieuNhap> {
    @Override
    public List<PhieuNhap> getAll() {
        List<PhieuNhap> list =  new ArrayList<>();
        query = "Select * from PhieuNhap";

        ResultSet resultSet = db.getTable(query,parameters);
        try {
            while (resultSet.next())
            {
                list.add(new InitInfor().initPN(resultSet));
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public PhieuNhap getSingleByID(String id) {
        query = "Select * from PhieuNhap where MaPN = ?";
        parameters.add(id);

        ResultSet resultSet = db.getTable(query,parameters);
        return new InitInfor().initPN(resultSet);
    }

    @Override
    public List<PhieuNhap> getByKeyword(String keyword) throws SQLException {
        List<PhieuNhap> list = new ArrayList<>();
        query = "Select * From PhieuNhap where NgayNhap like '%?%'";
        parameters.add(keyword);
        ResultSet resultSet = db.getTable(query,parameters);
        while (resultSet.next())
        {
            list.add(new InitInfor().initPN(resultSet));
        }
        return list;
    }

    @Override
    public void add(PhieuNhap info) {
        query = "Insert into PhieuNhap Values (?,?,?,?,?)";
        parameters.add(info.getMaPN());
        parameters.add(info.getNgayNhap());
        parameters.add(info.getMaNV());
        parameters.add(info.getMaNCC());
        parameters.add(String.valueOf(info.getTongTien()));

        db.executeQuery(query,parameters);
    }

    @Override
    public void edit(PhieuNhap info) {
        query = "Update PhieuNhap set NgayNhap = ?, TongTien = ? where MaPN = ?";
        parameters.add(info.getNgayNhap());
        parameters.add(String.valueOf(info.getTongTien()));
        parameters.add(info.getMaPN());

        db.executeQuery(query,parameters);
    }

    @Override
    public void delete(String id) {
        query = "Delete from PhieuNhap where MaPN = ?";
        parameters.add(id);

        db.executeQuery(query,parameters);
    }
}
