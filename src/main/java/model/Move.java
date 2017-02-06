package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model for Pokemon move
 * @author Bethany Corder
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Move {
	
	private VersionGroupDetails[] versionGroupDetails;
	private String moveUrl;
	private String moveName;
	
	public void setVersionGroupDetails(VersionGroupDetails[] versionGroupDetails) {
		this.versionGroupDetails = versionGroupDetails;
	}
	
	public void setMoveUrl(String moveUrl) {
		this.moveUrl = moveUrl;
	}
	
	public void setMoveName(String moveName) {
		this.moveName = moveName;
	}

}
