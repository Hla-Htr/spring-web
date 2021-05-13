package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.Model.NhaCungCap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NCCBus extends BaseBus implements IBus<NhaCungCap> {
    @Override
    public List<NhaCungCap> getAll() {
        List<NhaCungCap> list = new ArrayList<>();
        query = "Select * from NhaCungCap";
        ResultSet resultSet = db.getTable(query,parameters);
        try{
            while (resultSet.next())
            {
                list.add(new InitInfor().initNCC(resultSet));
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public NhaCungCap getSingleByID(String id) {
        query = "Select * from NhaCungCap where MaNCC = ?";
        parameters.add(id);
        ResultSet resultSet = db.getTable(query,parameters);
        NhaCungCap ncc  = new InitInfor().initNCC(resultSet);
        return ncc;
    }

    @Override
    public List<NhaCungCap> getByKeyword(String keyword) throws SQLException {
        List<NhaCungCap> list = new ArrayList<>();
        query = "Select * From NhaCungCap Where TenNCC like '%?%'";

        parameters.add(keyword);
        ResultSet resultSet = db.getTable(query,parameters);
        try
        {
            while (resultSet.next())
            {
                list.add(new InitInfor().initNCC(resultSet));
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void add(NhaCungCap info) {
        query = "Insert into NhaCungCap values (?,?,?,?,?,?,?)";
        parameters.add(info.getMaNCC());
        parameters.add(info.getTenNCC());
        parameters.add(info.getDiaChi());
        parameters.add(info.getSDT());
        parameters.add(info.getEmail());
        parameters.add(info.getFax());
        parameters.add(info.getTruSo());

        db.executeQuery(query,parameters);
    }

    @Override
    public void edit(NhaCungCap info) {
        query = "Update NhaCungCap set TenNCC = ?, DiaChi = ?, SDT = ?, EMail = ?, Fax = ?, TruSo = ? where MaNCC =?";
        parameters.add(info.getTenNCC());
        parameters.add(info.getDiaChi());
        parameters.add(info.getSDT());
        parameters.add(info.getEmail());
        parameters.add(info.getFax());
        parameters.add(info.getTruSo());
        parameters.add(info.getMaNCC());

        db.executeQuery(query,parameters);
    }

    @Override
    public void delete(String id) {
        query = "Delete from NhaCungCap where MaNCC = ?";
        parameters.add(id);

        db.executeQuery(query,parameters);
    }
}
