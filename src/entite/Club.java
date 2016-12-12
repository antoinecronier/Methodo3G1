package entite;

import java.util.ArrayList;

import database.GenericDAO;

public class Club implements GenericDAO<Club> {

	private Integer club_id;
	private String name;
	private Integer money;

	public Club(Integer club_id, String name, Integer money) {
		this.club_id = club_id;
		this.name = name;
		this.money = money;
	}

	public Integer getClub_id() {
		return club_id;
	}

	public void setClub_id(Integer club_id) {
		this.club_id = club_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	@Override
	public Club SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Club> Select(Integer id) {
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
	public void Update(Club item) {
		// TODO Auto-generated method stub

	}

}