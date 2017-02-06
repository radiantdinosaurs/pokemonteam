package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model for Pokemon stats
 * @author Bethany Corder
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats {

	private String statsUrl;
	private String statsName;
	private int effort;
	private int baseStat;
	
	public void setStatsUrl(String statsUrl) {
		this.statsUrl = statsUrl;
	}
	
	public void setStatsName(String statsName) {
		this.statsName = statsName;
	}
	
	public void setEffort(int effort) {
		this.effort = effort;
	}
	
	public void setBaseStat(int baseStat) {
		this.baseStat = baseStat;
	}
}
