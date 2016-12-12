package entite;

import java.util.ArrayList;

import database.GenericDAO;

public class Joueur {

	private Integer joueur_id;
	private String lastname;
	private String firstname;
	private String surname;
	private Integer price;

	public Joueur(Integer joueur_id, String lastname, String firstname, String surname, Integer price){
		this.joueur_id = joueur_id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.surname = surname;
		this.price = price;
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
}