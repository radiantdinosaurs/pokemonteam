package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.TeamSearch;

public class DatabaseReader {

	
	public int getTeamId(TeamSearch teamsearch) {
		ResultSet rs;
		int teamId = 0;
		try {
			Connection conn = ConnectionManager.openConnection();
			String query = "SELECT " + Contract.TeamTable.TEAM_ID + " FROM " + 
			Contract.DB_NAME + 
			"." + Contract.TeamTable.TABLE_NAME +
			" WHERE " + Contract.TeamTable.TEAM_ID + " = " + teamsearch.getTeamId() + ";";
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				teamId = rs.getInt("team_id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return teamId;
	}
	
	public String getTeamName(int teamId) {
		ResultSet rs;
		String teamName = "";
		try {
			Connection conn = ConnectionManager.openConnection();
			String query = "SELECT " + Contract.TeamTable.TEAM_NAME + " FROM " + 
			Contract.DB_NAME + 
			"." + Contract.TeamTable.TABLE_NAME +
			" WHERE " + Contract.TeamTable.TEAM_ID + " = " + teamId + ";";
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				teamName = rs.getString("team_name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return teamName;
	}
	
}
