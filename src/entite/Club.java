package entite;

import java.util.ArrayList;

import database.IGenericDAO;

public class Club {

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
}