package entite;

import java.util.ArrayList;

import database.GenericDAO;

public class Attribut implements GenericDAO<Attribut> {
	private Integer attribut_id;
	private String name;
	private Integer value;

	public Attribut(Integer attribut_id, String name, Integer value){
		this.attribut_id = attribut_id;
		this.name = name;
		this.value = value;

	}

	public Integer getAttribut_id() {
		return attribut_id;
	}

	public void setAttribut_id(Integer attribut_id) {
		this.attribut_id = attribut_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public Attribut SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Attribut> Select(Integer id) {
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
	public void Update(Attribut item) {
		// TODO Auto-generated method stub

	}

	@Override
	public Attribut Insert(Attribut item) {
		// TODO Auto-generated method stub
		return null;
	}
}
