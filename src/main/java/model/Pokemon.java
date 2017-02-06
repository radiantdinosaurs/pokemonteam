package model;

import com.fasterxml.jackson.annotation.*;

/**
 * Model for Pokemon objects
 * @author Bethany Corder
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {

	private Form[] forms;
	private Ability[] abilities;
	private Stats[] stats;
    private String name;
    private int weight;
    private Move[] move;
    private Sprite[] sprite;
    private HeldItem[] heldItem;
    String locationAreaEncounters;
    int height;
    boolean isDefault;
    private Species species;
    private int id;
    private int order;
    private GameIndice[] gameIndice;
    private int baseExperience;
    private Type[] types;
    
    public Form[] getForms() {
    	return forms;
    }
    
    public Ability[] getAbilities() {
    	return abilities;
    }
    
    public Stats[] getStats() {
    	return stats;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getWeight() {
    	return weight;
    }
    
    public Move[] getMove() {
    	return move;
    }
    
    public Sprite[] getSprite() {
    	return sprite;
    }
    
    public HeldItem[] getHeldItem() {
    	return heldItem;
    }
    
    public String getLocationAreaEncounters() {
    	return locationAreaEncounters;
    }
    
    public int getHeight() {
    	return height;
    }
    
    public boolean getIsDefault() {
    	return isDefault;
    }
    
    public Species getSpecies() {
    	return species;
    }
    
    public int getId() {
    	return id;
    }
    
    public int getOrder() {
    	return order;
    }
    
    public GameIndice[] getGameIndice() {
    	return gameIndice;
    }
    
    public int getBaseExperience() {
    	return baseExperience;
    }
    
    public Type[] getTypes() {
        return types;
    }
    
    public void setForms(Form[] forms) {
    	this.forms = forms;
    }
    
    public void setAbilities(Ability[] abilities) {
    	this.abilities = abilities;
    }
    
    public void setStats(Stats[] stats) {
    	this.stats = stats;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setWeight(int weight) {
    	this.weight = weight;
    }
    
    public void setMove(Move[] move) {
    	this.move = move;
    }
    
    public void setSprite(Sprite[] sprite) {
    	this.sprite = sprite;
    }
    
    public void setHeldItem(HeldItem[] heldItem) {
    	this.heldItem = heldItem;
    }
    
    public void setLocationAreaEncounters(String locationAreaEncounters) {
    	this.locationAreaEncounters = locationAreaEncounters;
    }
    
    public void setHeight(int height) {
    	this.height = height;
    }
    
    public void setIsDefault(boolean isDefault) {
    	this.isDefault = isDefault;
    }
    
    public void setSpecies(Species species) {
    	this.species = species;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public void setOrder(int order) {
    	this.order = order;
    }

    public void setGameIndice(GameIndice[] gameIndice) {
    	this.gameIndice = gameIndice;
    }
    
    public void setBaseExperience(int baseExperience) {
    	this.baseExperience = baseExperience;
    }
    
    public void setTypes(Type[] types) {
        this.types = types;
    }

    /**
     * Changes an array of types into a String
     * @return A string of the Pokemon's types
     */
    public String convertTypesToString() {
        String prefix = "";
        StringBuilder sb = new StringBuilder();
        for(Type pokemonType : types){
            sb.append(prefix);
            prefix = ", ";
            sb.append(pokemonType.toString());
        }
        return sb.toString();
    }
}