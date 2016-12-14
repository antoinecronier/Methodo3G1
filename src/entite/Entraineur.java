package entite;

import database.IGenericDAO;

public class Entraineur {
	private Integer id_entraineur;
	private String firstname_entraineur;
	private String lastname_entraineur;
	private Integer id_club;

	public Entraineur(Integer id_entraineur, String firstname_entraineur, String lastname_entraineur, Integer id_club) {
		this.id_entraineur = id_entraineur;
		this.firstname_entraineur = firstname_entraineur;
		this.lastname_entraineur = lastname_entraineur;
		this.id_club = id_club;
	}

	public Integer getId_entraineur() {
		return id_entraineur;
	}

	public void setId_entraineur(Integer id_entraineur) {
		this.id_entraineur = id_entraineur;
	}

	public String getFirstname_entraineur() {
		return firstname_entraineur;
	}

	public void setFirstname_entraineur(String firstname_entraineur) {
		this.firstname_entraineur = firstname_entraineur;
	}

	public String getLastname_entraineur() {
		return lastname_entraineur;
	}

	public void setLastname_entraineur(String lastname_entraineur) {
		this.lastname_entraineur = lastname_entraineur;
	}

	public Integer getId_club() {
		return id_club;
	}

	public void setId_club(Integer id_club) {
		this.id_club = id_club;
	}
	
}