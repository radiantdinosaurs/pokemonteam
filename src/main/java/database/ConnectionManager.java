package database;

import java.sql.*;

/**
 * Handles connections to the database
 * @author radiantdinosaurs
 */
class ConnectionManager {

    private static Connection conn;

    /**
     * Opens a connection
     * @return a connection
     */
    static Connection openConnection() {
        try {
        	//Class.forName(Contract.DB_URL);
            conn = DriverManager.getConnection(Contract.DB_URL, Contract.USER, Contract.PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}