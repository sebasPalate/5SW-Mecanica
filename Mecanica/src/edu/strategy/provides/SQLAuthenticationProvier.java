package edu.strategy.provides;

import edu.strategy.impl.Principal;
import edu.strategy.util.MySQLDBAdapter;
import edu.strategy.impl.IAuthenticationStrategy;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class SQLAuthenticationProvier implements IAuthenticationStrategy {

    private static final String USER_QUERY = "SELECT userName,rol, password from users where userName= ? and password = ?";
    private MySQLDBAdapter mysqlAdapter;

    public SQLAuthenticationProvier() {
        mysqlAdapter = new MySQLDBAdapter();
    }

    @Override
    public Principal authenticate(String user, String passwrd) {
        try {
            Connection connection = mysqlAdapter.getConnection();
            Statement statement = connection.createStatement();
            String queryUser = String.format(USER_QUERY, user, passwrd);
            ResultSet query = statement.executeQuery(queryUser);
            while (query.next()) {
                return new Principal(query.getString("userName"),
                        query.getString("rol"));
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
