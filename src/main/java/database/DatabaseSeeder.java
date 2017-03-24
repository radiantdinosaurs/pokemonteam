package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import model.Pokemon;
import model.Team;

public class DatabaseSeeder {

	
	public int insertTeamIntoDatabase(Team team) {
		PreparedStatement stmt;
		int id = 0;
		boolean returnLastInsertId = true;
		try {
			Connection conn = ConnectionManager.openConnection();
	        String sql = "INSERT INTO " + 
			Contract.DB_NAME + "." +
	        Contract.TeamTable.TABLE_NAME + " (" +
			Contract.TeamTable.TEAM_NAME + ") VALUES (?);";
	        stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	        stmt.setString(1, team.getTeamName());
	        stmt.executeUpdate();
	        if(returnLastInsertId) {
	        	ResultSet rs = stmt.getGeneratedKeys();
	        	rs.next();
	        	id = rs.getInt(1);
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}
	
	public void insertPokemonIntoDatabase(Team team, List<Pokemon> list) {
		for(int i = 0; i < list.size(); i++) {
			try {
				Connection conn = ConnectionManager.openConnection();
				String sql = "INSERT INTO " +
				Contract.DB_NAME + "." +
				Contract.PokemonTable.TABLE_NAME + " (" +
				Contract.PokemonTable.POKEMON_NAME + ", " +
				Contract.PokemonTable.TEAM_ID + ") VALUES (?, ?);";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, list.get(i).getName());
				ps.setInt(2, team.getTeamId());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
