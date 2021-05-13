package T3H.QuanLyBanGiay.Servier;

import T3H.QuanLyBanGiay.Business.LGBus;
import T3H.QuanLyBanGiay.Model.LoaiGiay;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class LoaiGiayService implements ILoaiGiayService{
    LGBus bus;

    public LoaiGiayService() {
        bus = new LGBus();
    }

    @Override
    public List<LoaiGiay> getAll() {
        return bus.getAll();
    }

    @Override
    public LoaiGiay getByID(String id) {
        return null;
    }

    @Override
    public List<LoaiGiay> getByKeyWord(String keyword) throws SQLException {
        return null;
    }

    @Override
    public void add(LoaiGiay info) {

    }

    @Override
    public void edit(LoaiGiay info) {

    }

    @Override
    public void delete(String id) {

    }
}
