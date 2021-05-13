package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.Model.LoaiGiay;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LGBus extends BaseBus implements IBus<LoaiGiay> {
    @Override
    public List<LoaiGiay> getAll() {
        List<LoaiGiay> list = new ArrayList<>();
        query = "Select * from LoaiGiay";
        ResultSet resultSet = db.getTable(query,parameters);
        try{
            while (resultSet.next())
            {
                LoaiGiay loaiGiay = new InitInfor().initLoaiGiay(resultSet);
                list.add(loaiGiay);
            }
        }catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        clear();
        return list;
    }

    @Override
    public LoaiGiay getSingleByID(String id) {
        query = "Select * from LoaiGiay where MaLG = ?";
        parameters.add(id);

        ResultSet resultSet = db.getTable(query,parameters);

        LoaiGiay loaiGiay = new InitInfor().initLoaiGiay(resultSet);
        clear();

        return loaiGiay;
    }

    @Override
    public List<LoaiGiay> getByKeyword(String keyword) throws SQLException {
        List<LoaiGiay> list = new ArrayList<>();
        query = "Select * from LoaiGiay where TenLG like '%?%'";
        parameters.add(keyword);
        ResultSet resultSet = db.getTable(query,parameters);
        try {
            while (resultSet.next())
            {
                LoaiGiay loaiGiay = new InitInfor().initLoaiGiay(resultSet);

                list.add(loaiGiay);
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        clear();
        return list;
    }

    @Override
    public void add(LoaiGiay info) {
        query = "Insert into Giay values (?,?)";
        parameters.add(info.getMaLoaiGiay());
        parameters.add(info.getTenLoaiGiay());

        db.executeQuery(query,parameters);
        clear();
    }

    @Override
    public void edit(LoaiGiay info) {
        query = "Update LoaiGiay set TenLG = ? where MaLG = ?";
        parameters.add(info.getTenLoaiGiay());
        parameters.add(info.getMaLoaiGiay());

        db.executeQuery(query,parameters);
        clear();
    }

    @Override
    public void delete(String id) {
        query = "Delete from LoaiGiay where MaLG = ?";
        parameters.add(id);

        db.executeQuery(query,parameters);
        clear();
    }
}
