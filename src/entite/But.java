package entite;

import java.sql.Time;
import java.util.ArrayList;

import database.IGenericDAO;

public class But {
	private Integer but_id;
	private Time butMarque;

	public But(Integer but_id, Time butMarque){

	this.but_id = but_id;
	this.butMarque = butMarque;

	}

	public Integer getBut_id() {
		return but_id;
	}

	public void setBut_id(Integer but_id) {
		this.but_id = but_id;
	}

	public Time getButMarque() {
		return butMarque;
	}

	public void setButMarque(Time butMarque) {
		this.butMarque = butMarque;
	}
}



