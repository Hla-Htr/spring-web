package T3H.QuanLyBanGiay.Business;

import java.sql.SQLException;
import java.util.List;

public interface IBus<T> {
    public List<T> getAll();
    public T getSingleByID(String id);
    public List<T> getByKeyword(String keyword) throws SQLException;
    public void add(T info);
    public void edit(T info);
    public void delete(String id);
}
