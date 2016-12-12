package entite;

import java.util.ArrayList;

import database.GenericDAO;

public class Match {
	private Integer match_id;
	private String name;

	public Match(String name, Integer match_id){
		this.name = name;
		this.match_id = match_id;

	}

	public Integer getMatch_id() {
		return match_id;
	}

	public void setMatch_id(Integer match_id) {
		this.match_id = match_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

