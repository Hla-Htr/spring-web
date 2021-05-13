package T3H.QuanLyBanGiay.Servier;

import T3H.QuanLyBanGiay.Business.GiayBus;
import T3H.QuanLyBanGiay.Model.Giay;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class GiayService implements IGiayService {
    private GiayBus bus;
    public GiayService()
    {
        bus = new GiayBus();
    }
    @Override
    public List<Giay> getAll() {
        return bus.getAll();
    }

    @Override
    public Giay getByID(String id) {
        return bus.getSingleByID(id);
    }

    @Override
    public List<Giay> getByKeyWord(String keyword) throws SQLException{
        return bus.getByKeyword(keyword);
    }

    @Override
    public void add(Giay info) {
        bus.add(info);
    }

    @Override
    public void edit(Giay info) {
        bus.edit(info);
    }

    @Override
    public void delete(String id) {
        bus.delete(id);
    }
}
