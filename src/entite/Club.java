package entite;

import java.util.ArrayList;
import database.IGenericDAO;

public class Club {
	private Integer id_club;
	private String name;
	private Integer club_money;
	private ArrayList<Joueur> joueur;

	public Club(Integer id_club, String name, Integer club_money, ArrayList<Joueur> joueur) {
		this.id_club = id_club;
		this.name = name;
		this.club_money = club_money;
		this.joueur = joueur;
	}

	public Integer getId_club() {
		return id_club;
	}

	public void setId_club(Integer id_club) {
		this.id_club = id_club;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getClub_money() {
		return club_money;
	}

	public void setClub_money(Integer club_money) {
		this.club_money = club_money;
	}

	public ArrayList<Joueur> getJoueur() {
		return joueur;
	}

	public void setJoueur(ArrayList<Joueur> joueur) {
		this.joueur = joueur;
	}
	
}