package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Handles creating the tables in the database
 * @author radiantdinosaurs
 */
public class CreateTables {

    /**
     * Creates a Pokemon table in the database
     */
    public void createPokemonTableInDatabase() {
        try {
            Connection conn = ConnectionManager.openConnection();
            Statement stmt = conn.createStatement();
            String tableCreationStatement = "CREATE TABLE IF NOT EXISTS " + Contract.DB_NAME + "." +
                    Contract.PokemonTable.TABLE_NAME + " ( " +
                    Contract.PokemonTable.POKEMON_ID + " MEDIUMINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                    Contract.PokemonTable.POKEMON_NAME + " VARCHAR(255) NOT NULL, " + 
                    Contract.PokemonTable.TEAM_ID + " SMALLINT UNSIGNED NOT NULL, CONSTRAINT `" +
                    Contract.PokemonTable.FK_POKEMON_TEAM + "` FOREIGN KEY (" + 
                    Contract.PokemonTable.TEAM_ID + ") REFERENCES "+ 
                    Contract.TeamTable.TABLE_NAME + " (" + Contract.TeamTable.TEAM_ID + ") ON DELETE CASCADE ON UPDATE RESTRICT)";
            stmt.executeUpdate(tableCreationStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Creates a team table in the database
     */
    public void createTeamTableInDatabase() {
        try {
            Connection conn = ConnectionManager.openConnection();
            Statement stmt = conn.createStatement();
            String tableCreationStatement = "CREATE TABLE IF NOT EXISTS " + Contract.DB_NAME + "." +
                    Contract.TeamTable.TABLE_NAME + " ( " +
                    Contract.TeamTable.TEAM_ID + " SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                    Contract.TeamTable.TEAM_NAME + " VARCHAR(255) NOT NULL)";
            stmt.executeUpdate(tableCreationStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
