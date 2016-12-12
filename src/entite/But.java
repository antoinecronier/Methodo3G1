package entite;

import java.sql.Time;
import java.util.ArrayList;

import database.GenericDAO;

public class But implements GenericDAO<But>
{
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

	@Override
	public But SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<But> Select(Integer id) {
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
	public void Update(But item) {
		// TODO Auto-generated method stub

	}

	@Override
	public But Insert(But item) {
		// TODO Auto-generated method stub
		return null;
	}
}



