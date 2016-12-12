package entite;

import java.util.ArrayList;

import database.GenericDAO;

public class Entraineur implements GenericDAO<Entraineur> {

	private Integer entraineur_id;
	private String firstname;
	private String lastname;

	public Entraineur(Integer entraineur_id, String firstname, String lastname) {
		this.entraineur_id = entraineur_id;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Integer getEntraineur_id() {
		return entraineur_id;
	}

	public void setEntraineur_id(Integer entraineur_id) {
		this.entraineur_id = entraineur_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public Entraineur SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Entraineur> Select(Integer id) {
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
	public void Update(Entraineur item) {
		// TODO Auto-generated method stub

	}

	@Override
	public Entraineur Insert(Entraineur item) {
		// TODO Auto-generated method stub
		return null;
	}

}