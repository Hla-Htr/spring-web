package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.Model.Giay;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GiayBus extends BaseBus implements IBus<Giay> {
    @Override
    public List<Giay> getAll() {
        List<Giay> list = new ArrayList<>();
        query = "Select * from Giay";

        ResultSet resultSet = db.getTable(query,parameters);
        try{
            while (resultSet.next())
            {
                Giay giay = new InitInfor().initShoe(resultSet);

                list.add(giay);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        clear();
        return list;
    }

    @Override
    public Giay getSingleByID(String id) {
        query = "Select * from Giay where MaGiay = ?";
        parameters.add(id);

        ResultSet resultSet = db.getTable(query,parameters);

        Giay giay = new InitInfor().initShoe(resultSet);
        clear();
        return giay;
    }

    @Override
    public List<Giay> getByKeyword(String keyword) throws SQLException {
        List<Giay> list = new ArrayList<>();
        query = "Select * from Giay where TenGiay like '%?%'";

        parameters.add(keyword);
        ResultSet resultSet = db.getTable(query,parameters);
        try {
            while (resultSet.next())
            {
                Giay giay = new InitInfor().initShoe(resultSet);

                list.add(giay);
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        clear();
        return list;
    }

    @Override
    public void add(Giay info) {
        query = "Insert into Giay values (?,?,?,?,?,?,?,?,?)";
        parameters.add(info.getMaGiay());
        parameters.add(info.getTenGiay());
        parameters.add(String.valueOf(info.getSize()));
        parameters.add(String.valueOf(info.getSoLuong()));
        parameters.add(String.valueOf(info.getGia()));
        parameters.add(info.getMaLG());
        parameters.add(info.getMaNSX());
        parameters.add(info.getAnh());
        parameters.add(info.getMoTa());

        db.executeQuery(query,parameters);
        clear();

    }

    @Override
    public void edit(Giay info) {
        query = "Update Giay set TenGiay = ?, Size = ?, SoLuong = ?, Gia = ?, Anh = ?, MoTa = ? where MaGiay = ?";
        parameters.add(info.getTenGiay());
        parameters.add(String.valueOf(info.getSize()));
        parameters.add(String.valueOf(info.getSoLuong()));
        parameters.add(String.valueOf(info.getGia()));
        parameters.add(info.getAnh());
        parameters.add(info.getMoTa());
        parameters.add(info.getMaGiay());

        db.executeQuery(query,parameters);
        clear();
    }

    @Override
    public void delete(String id) {
        query = "Delete from Giay where MaGiay = ?";
        parameters.add(id);

        db.executeQuery(query,parameters);
        clear();
    }
}
