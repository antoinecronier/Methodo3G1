package entite;

import java.util.ArrayList;

public class Joueur {
	
	private Integer joueur_id;
	private String lastname;
	private String firstname;
	private String surname;
	private Integer price;
	private Integer club_id;
	private ArrayList<Attribut> attribut;

	public Joueur(Integer joueur_id, String lastname, String firstname, String surname, Integer price, Integer club_id, ArrayList<Attribut> attribut){
		this.joueur_id = joueur_id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.surname = surname;
		this.price = price;
		this.club_id = club_id;
		this.attribut = attribut; 
	}

	public Integer getJoueur_id() {
		return joueur_id;
	}

	public void setJoueur_id(Integer joueur_id) {
		this.joueur_id = joueur_id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public Integer getClub_id() {
		return club_id;
	}

	public void setClub_id(Integer club_id) {
		this.club_id = club_id;
	}

	public ArrayList<Attribut> getAttribut() {
		return attribut;
	}

	public void setAttribut(ArrayList<Attribut> attribut) {
		this.attribut = attribut;
	}

	@Override
	public Joueur SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Joueur> Select(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Update(Joueur item) {
		// TODO Auto-generated method stub

	}

	@Override
	public Joueur Insert(Joueur item) {
		// TODO Auto-generated method stub
		return null;
	}
	
}