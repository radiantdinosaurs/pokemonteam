package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model for information 
 * @author Bethany Corder
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VersionGroupDetails {

	private String moveLearnMethodUrl;
	private String moveName;
	private int levelLearnedAt;
	private String versionUrl;
	private String versionName;
	
	public void setMoveLearnMethodUrl(String moveLearnMethodUrl) {
		this.moveLearnMethodUrl = moveLearnMethodUrl;
	}
	
	public void setMoveName(String moveName) {
		this.moveName = moveName;
	}
	
	public void setLevelLearnedAt(int levelLearnedAt) {
		this.levelLearnedAt = levelLearnedAt;
	}
	
	public void setVersionUrl(String versionUrl) {
		this.versionUrl = versionUrl;
	}
	
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	
}
