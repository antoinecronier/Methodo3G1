package database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import database.DatabaseAccess;
import database.IGenericDAO;
import entite.Attribut;
import entite.Joueur;

public class JoueurDAO implements IGenericDAO<Joueur> {

	public final static String ID = "id_joueur";
	public final static String LASTNAME = "lastname_joueur";
	public final static String FIRSTNAME = "firstname_joueur";
	public final static String SURNAME = "surname_joueur";
	public final static String PRICE = "price_joueur";
	public final static String TABLE = "Joueur";
	
	@Override
	public ArrayList<Joueur> SelectAll() {
		List<Joueur>joueurs = new LinkedList<Joueur>();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" ;");

			Joueur joueur1 = null;
			while (resultSet.next()) {
				joueur1 = new Joueur();
				joueur1.setJoueur_id(Integer.parseInt(resultSet
						.getString(ID)));
				joueur1.setLastname(resultSet.getString(LASTNAME));
				joueur1.setFirstname(resultSet.getString(FIRSTNAME));
				joueur1.setSurname(resultSet.getString(SURNAME));
				joueur1.setPrice(Integer.parseInt(resultSet.getString(PRICE)));
				joueurs.add(joueur1);
			}
			resultSet.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<Joueur> returnJoueurs = new ArrayList<Joueur>(joueurs);
		return returnJoueurs;
	}

	@Override
	public Joueur Select(Integer id) {
		Joueur joueur = new Joueur();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" " + "WHERE Joueur. = "
					+ id + ";");

			resultSet.next();

			joueur.setJoueur_id(Integer.parseInt(resultSet
					.getString(ID)));
			joueur.setLastname(resultSet.getString(LASTNAME));
			joueur.setFirstname(resultSet.getString(FIRSTNAME));
			joueur.setSurname(resultSet.getString(SURNAME));
			joueur.setPrice(Integer.parseInt(resultSet.getString(PRICE)));

			resultSet.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return joueur;
	}

	@Override
	public void DeleteAll() {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("DELETE FROM "
					+ DatabaseAccess.DB + "."+TABLE+";");

			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Delete(Integer id) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("DELETE FROM "
					+ DatabaseAccess.DB + ".Joueur WHERE "+TABLE+"."+ID+" = " + id
					+ " ;");

			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Joueur item) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet1 = statement.executeQuery("UPDATE "
					+ DatabaseAccess.DB + "."+TABLE+" SET "
					+" "+LASTNAME+" = "+ item.getLastname() + ""
					+" WHERE "+TABLE+"."+ID+" = " + item.getJoueur_id()
					+";");
			ResultSet resultSet2 = statement.executeQuery("UPDATE "
					+ DatabaseAccess.DB + "."+TABLE+" SET "
					+" "+FIRSTNAME+" = "+ item.getFirstname() + ""
					+" WHERE "+TABLE+"."+ID+" = " + item.getJoueur_id()
					+";");
			ResultSet resultSet3 = statement.executeQuery("UPDATE "
					+ DatabaseAccess.DB + "."+TABLE+" SET "
					+" "+SURNAME+" = "+ item.getSurname() + ""
					+" WHERE "+TABLE+"."+ID+" = " + item.getJoueur_id()
					+";");
			ResultSet resultSet4 = statement.executeQuery("UPDATE "
					+ DatabaseAccess.DB + "."+TABLE+" SET "
					+" "+PRICE+" = "+ item.getPrice() + ""
					+" WHERE "+TABLE+"."+ID+" = " + item.getJoueur_id()
					+";");
			resultSet1.close();
			resultSet2.close();
			resultSet3.close();
			resultSet4.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Insert(Joueur item) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet1 = statement.executeQuery("INSERT INTO "
					+ DatabaseAccess.DB + "."+TABLE+" () VALUES "
					+"(null," + item.getLastname() + ")"+
					";");
			ResultSet resultSet2 = statement.executeQuery("INSERT INTO "
					+ DatabaseAccess.DB + "."+TABLE+" () VALUES "
					+"(null," + item.getFirstname() + ")"+
					";");
			ResultSet resultSet3 = statement.executeQuery("INSERT INTO "
					+ DatabaseAccess.DB + "."+TABLE+" () VALUES "
					+"(null," + item.getSurname() + ")"+
					";");
			ResultSet resultSet4 = statement.executeQuery("INSERT INTO "
					+ DatabaseAccess.DB + "."+TABLE+" () VALUES "
					+"(null," + item.getPrice() + ")"+
					";");
			resultSet1.close();
			resultSet2.close();
			resultSet3.close();
			resultSet4.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
