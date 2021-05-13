package T3H.QuanLyBanGiay.DataAccess;

import java.sql.*;
import java.util.List;

public class ConnectionSql {
    private final String connectionString;
    private final String user;
    private final String password;
    private final String serverName;
    private final String databaseName;
    private Connection connection;
    private PreparedStatement ps;

    public ConnectionSql() {
        this.user = "sa";
        this.password = "123456";
        this.serverName = "DESKTOP-3JVOL5C";
        this.databaseName = "DB_QLBanGiay";
        this.connectionString = "jdbc:sqlserver://" + serverName + ";databaseName=" + databaseName;
    }
    public Connection getConnection() {
        if (connection != null) {
            return connection;
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(connectionString, user, password);

            System.out.println("SQL connected");
        } catch (Exception e) {
            System.out.println("SQL failed!!!");
            e.printStackTrace();
        }

        return connection;
    }
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                ps.close();
            } catch (Exception throwables) {
                throwables.printStackTrace();
            } finally {
                connection = null;
                ps =null;
            }
        }
    }

    public ResultSet getTable(String query, List<String> parameters) {
        ResultSet result = null;

        try {
            ps = getConnection().prepareStatement(query);

            for (int i = 0; i < parameters.size(); i++) {
                ps.setString(i + 1, parameters.get(i));
            }

            result = ps.executeQuery();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return result;
    }

    public int executeQuery(String query, List<String> parameters) {
        int result = 0;
        try {
            ps = getConnection().prepareStatement(query);

            for (int i = 0; i < parameters.size(); i++) {
                ps.setString(i + 1, parameters.get(i));
            }

            result = ps.executeUpdate();

        } catch (Exception throwables) {
            throwables.printStackTrace();
        }

        return result;
    }

    public void clear()
    {
        closeConnection();
    }
}
