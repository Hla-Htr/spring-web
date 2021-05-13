package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.Model.NhaSanXuat;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NSXBus extends BaseBus implements IBus<NhaSanXuat> {
    @Override
    public List<NhaSanXuat> getAll() {
        List<NhaSanXuat> list = new ArrayList<>();

        query = "Select * from NhaSanXuat";
        ResultSet resultSet = db.getTable(query,parameters);
        try {
            while (resultSet.next())
            {
                list.add(new InitInfor().initNSX(resultSet));
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public NhaSanXuat getSingleByID(String id) {
        query = "Select * from NhaSanXuat where MaNSX = ?";
        parameters.add(id);
        ResultSet resultSet = db.getTable(query,parameters);

        return new InitInfor().initNSX(resultSet);
    }

    @Override
    public List<NhaSanXuat> getByKeyword(String keyword) throws SQLException {
        List<NhaSanXuat> list = new ArrayList<>();
        query = "Select * from NhaSanXuat where TenNSX like '%?%'";
        parameters.add(keyword);
        ResultSet resultSet = db.getTable(query,parameters);
        while (resultSet.next())
        {
            list.add(new InitInfor().initNSX(resultSet));
        }
        return list;
    }

    @Override
    public void add(NhaSanXuat info) {
        query = "Insert into NhaSanXuat values (?,?,?,?,?,?,?)";
        parameters.add(info.getMaNSX());
        parameters.add(info.getTenNSX());
        parameters.add(info.getDiaChi());
        parameters.add(info.getSDT());
        parameters.add(info.getEmail());
        parameters.add(info.getFax());
        parameters.add(info.getTruSo());

        db.executeQuery(query,parameters);
    }

    @Override
    public void edit(NhaSanXuat info) {
        query = "Update NhaSanXuat set TenNSX =?,DiaChi =?,SDT =?,EMail = ?,Fax = ?,TruSo = ? where MaNSx = ?";
        parameters.add(info.getTenNSX());
        parameters.add(info.getDiaChi());
        parameters.add(info.getSDT());
        parameters.add(info.getEmail());
        parameters.add(info.getFax());
        parameters.add(info.getTruSo());
        parameters.add(info.getMaNSX());

        db.executeQuery(query,parameters);
    }

    @Override
    public void delete(String id) {
        query = "delete from NhaSanXuat where MaNSX = ?";
        parameters.add(id);

        db.executeQuery(query,parameters);
    }
}
