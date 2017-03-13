//package database;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class CreateTeamInDatabase {
//        
//	try {
//		Connection conn = ConnectionManager.openConnection();
//        String sql = "INSERT INTO " + 
//		Contract.DB_NAME + "." +
//        Contract.TeamTable.TABLE_NAME + " (" +
//		Contract.TeamTable.TEAM_NAME + ") VALUES (?);";
//        PreparedStatement ps = conn.prepareStatement(sql);
//        //ps.setInt();
//        ps.executeUpdate();
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//	
//}
