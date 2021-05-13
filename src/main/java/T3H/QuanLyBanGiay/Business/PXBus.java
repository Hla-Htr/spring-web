package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.Model.PhieuXuat;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PXBus extends BaseBus implements IBus<PhieuXuat> {
    @Override
    public List<PhieuXuat> getAll() {
        List<PhieuXuat> list = new ArrayList<>();
        query = "Select * from PhieuXuat";
        ResultSet resultSet = db.getTable(query,parameters);

        try{
            while (resultSet.next())
            {
                list.add(new InitInfor().initPX(resultSet));
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public PhieuXuat getSingleByID(String id) {
        query = "select * from PhieuXuat where MaPX = ?";
        parameters.add(id);
        ResultSet resultSet = db.getTable(query,parameters);

        return new InitInfor().initPX(resultSet);
    }

    @Override
    public List<PhieuXuat> getByKeyword(String keyword) throws SQLException {
        List<PhieuXuat> list = new ArrayList<>();
        query = "Select * From PhieuXuat where NgayXuat like '%?%'";
        parameters.add(keyword);
        ResultSet resultSet = db.getTable(query,parameters);
        while (resultSet.next())
        {
            list.add(new InitInfor().initPX(resultSet));
        }
        return list;
    }

    @Override
    public void add(PhieuXuat info) {
        query = "Insert Into PhieuXuat values (?,?,?,?,?)";
        parameters.add(info.getMaPX());
        parameters.add(info.getNgayXuat());
        parameters.add(info.getMaNV());
        parameters.add(info.getMaKH());
        parameters.add(String.valueOf(info.getTongtien()));

        db.executeQuery(query,parameters);
    }

    @Override
    public void edit(PhieuXuat info) {
        query = "Update PhieuXuat set NgayXuat = ?, TongTien = ? where MaPX = ?";
        parameters.add(info.getNgayXuat());
        parameters.add(String.valueOf(info.getTongtien()));
        parameters.add(info.getMaPX());

        db.executeQuery(query,parameters);
    }

    @Override
    public void delete(String id) {
        query = "Delete from PhieuXuat where MaPX = ?";
        parameters.add(id);

        db.executeQuery(query,parameters);
    }
}
