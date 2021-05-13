package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.DataAccess.ConnectionSql;

import java.util.ArrayList;
import java.util.List;

public class BaseBus {
    protected ConnectionSql db;
    protected String query;
    protected List<String> parameters;

    public BaseBus(){
        db = new ConnectionSql();
        parameters = new ArrayList<>();
    }

    public void clear()
    {
        db.clear();
        parameters.clear();
    }
}
