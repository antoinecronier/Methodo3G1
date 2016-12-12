package entite;

import java.util.ArrayList;

import database.GenericDAO;

public class Saison implements GenericDAO<Saison>{
	private Integer saison_id;
	private String name;

	public Saison(Integer saison_id, String name){
		this.saison_id = saison_id;
		this.name = name;

	}

	public Integer getSaison_id() {
		return saison_id;
	}

	public void setSaison_id(Integer saison_id) {
		this.saison_id = saison_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Saison SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Saison> Select(Integer id) {
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
	public void Update(Saison item) {
		// TODO Auto-generated method stub

	}
}
