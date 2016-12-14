package entite;

import java.util.ArrayList;

public class Joueur {
	private Integer id_joueur;
	private String lastname_joueur;
	private String firstname_joueur;
	private String surname_joueur;
	private Integer price;
	private Integer id_club;
	private ArrayList<Attribut> attribut;

	public Joueur(Integer id_joueur, String lastname_joueur, String firstname_joueur, String surname_joueur, Integer price, Integer id_club, ArrayList<Attribut> attribut){
		this.id_joueur = id_joueur;
		this.lastname_joueur = lastname_joueur;
		this.firstname_joueur = firstname_joueur;
		this.surname_joueur = surname_joueur;
		this.price = price;
		this.id_club = id_club;
		this.attribut = attribut;
	}

	public Integer getId_joueur() {
		return id_joueur;
	}

	public void setId_joueur(Integer id_joueur) {
		this.id_joueur = id_joueur;
	}

	public String getLastname_joueur() {
		return lastname_joueur;
	}

	public void setLastname_joueur(String lastname_joueur) {
		this.lastname_joueur = lastname_joueur;
	}

	public String getFirstname_joueur() {
		return firstname_joueur;
	}

	public void setFirstname_joueur(String firstname_joueur) {
		this.firstname_joueur = firstname_joueur;
	}

	public String getSurname_joueur() {
		return surname_joueur;
	}

	public void setSurname_joueur(String surname_joueur) {
		this.surname_joueur = surname_joueur;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getId_club() {
		return id_club;
	}

	public void setId_club(Integer id_club) {
		this.id_club = id_club;
	}

	public ArrayList<Attribut> getAttribut() {
		return attribut;
	}

	public void setAttribut(ArrayList<Attribut> attribut) {
		this.attribut = attribut;
	}

}