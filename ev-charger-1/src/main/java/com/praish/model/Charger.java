package com.praish.model;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Chargers")
@Getter
@Setter
@Data
@ToString
public class Charger {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String level;
	private int ratekw;
	
	
	  public Charger() {
	  
	  }
	  
	  public Charger(String name, String level, int ratekw) { super(); this.name =
	  name; this.level = level; this.ratekw = ratekw; }
	 
	
		
		/*
		 * public Long getId() { return id; } public void setId(Long id) { this.id = id;
		 * } public String getName() { return name; } public void setName(String name) {
		 * this.name = name; } public String getLevel() { return level; } public void
		 * setLevel(String level) { this.level = level; } public int getRatekw() {
		 * return ratekw; } public void setRatekw(int ratekw) { this.ratekw = ratekw; }
		 */
		 
	@ManyToOne
    @JoinColumn(name="charger_id", nullable=false)
    private User user;
}
