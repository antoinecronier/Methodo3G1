package entite;

import java.util.ArrayList;

<<<<<<< HEAD
public class Club {
	private Integer club_id;
	private String name;
	private Integer money;
	private ArrayList<Joueur> joueur;

	public Club(Integer club_id, String name, Integer money, ArrayList<Joueur> joueur) {
=======
import database.IGenericDAO;

public class Club {

	private Integer club_id;
	private String name;
	private Integer money;

	public Club(Integer club_id, String name, Integer money) {
>>>>>>> origin
		this.club_id = club_id;
		this.name = name;
		this.money = money;
		this.joueur = joueur;
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
<<<<<<< HEAD

	public ArrayList<Joueur> getJoueur() {
		return joueur;
	}

	public void setJoueurs(ArrayList<Joueur> joueur) {
		this.joueur = joueur;
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

	@Override
	public Club Insert(Club item) {
		// TODO Auto-generated method stub
		return null;
	}
	
=======
>>>>>>> origin
}