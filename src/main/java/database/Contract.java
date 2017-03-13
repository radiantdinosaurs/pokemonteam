package database;

/**
 * Database information
 * @author radiantdinosaurs
 */
final class Contract {

    static final String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String DB_NAME = "pokemonteam";
    static final String USER = "root";
    static final String PASS = "cookiecat25";

    public static abstract class PokemonTable {
    	public static final String TABLE_NAME = "pokemon";
    	public static final String POKEMON_ID = "pokemon_id";
    	public static final String POKEMON_NAME = "pokemon_name";
    	public static final String TEAM_ID = "team_id";
    	public static final String FK_POKEMON_TEAM = "fk_pokemon_team";
    }
    
    public static abstract class TeamTable {
        public static final String TABLE_NAME = "teams";
        public static final String TEAM_ID = "team_id";
        public static final String TEAM_NAME = "team_name";
    }

}