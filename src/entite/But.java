package entite;

import java.sql.Time;
import java.util.ArrayList;

import database.IGenericDAO;

public class But {
	private Integer id_but;
	private Time atTime;
	private Integer id_match;
	private Integer id_joueur;

	public But(Integer id_but, Time atTime, Integer id_match, Integer id_joueur){

	this.id_but = id_but;
	this.atTime = atTime;
	this.id_match = id_match;
	this.id_joueur = id_joueur;

	}
	
	public But(){
		
	}
	
	public Integer getId_but() {
		return id_but;
	}

	public void setId_but(Integer id_but) {
		this.id_but = id_but;
	}

	public Time getAtTime() {
		return atTime;
	}

	public void setAtTime(Time atTime) {
		this.atTime = atTime;
	}

	public Integer getId_match() {
		return id_match;
	}

	public void setId_match(Integer id_match) {
		this.id_match = id_match;
	}

	public Integer getId_joueur() {
		return id_joueur;
	}

	public void setId_joueur(Integer id_joueur) {
		this.id_joueur = id_joueur;
	}
	
}

