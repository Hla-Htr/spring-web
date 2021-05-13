package T3H.QuanLyBanGiay.Servier;

import java.sql.SQLException;
import java.util.List;

public interface ICommonService <T>{
    public List<T> getAll();
    public T getByID(String id);
    public List<T> getByKeyWord(String keyword) throws SQLException;
    public void add(T info);
    public void edit(T info);
    public void delete(String id);
}
