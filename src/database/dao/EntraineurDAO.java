package database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import database.DatabaseAccess;
import database.IGenericDAO;
import entite.Entraineur;

public class EntraineurDAO implements IGenericDAO<Entraineur> {

	public final static String ID = "id_entraineur";
	public final static String FIRSTNAME = "firstname_entraineur";
	public final static String LASTNAME = "lastname_entraineur";
	public final static String IDCLUB = "id_club";
	public final static String TABLE = "Entraineur";

	@Override
	public ArrayList<Entraineur> SelectAll() {
		List<Entraineur> entraineurs = new LinkedList<Entraineur>();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" ;");

			Entraineur entraineur = null;
			while (resultSet.next()) {
				entraineur = new Entraineur();
				entraineur.setId_entraineur(Integer.parseInt(resultSet.getString(ID)));
				entraineur.setFirstname_entraineur(resultSet.getString(FIRSTNAME));
				entraineur.setLastname_entraineur(resultSet.getString(LASTNAME));
				entraineur.setId_club(Integer.parseInt(resultSet.getString(IDCLUB)));
				entraineurs.add(entraineur);
			}
			resultSet.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<Entraineur> returnEntraineurs = new ArrayList<Entraineur>(entraineurs);
		return returnEntraineurs;
	}

	@Override
	public Entraineur Select(Integer id) {
		Entraineur entraineur = new Entraineur();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" " + "WHERE "+TABLE+"."+ID+" = "
					+ id + ";");

			if (resultSet.next() != false) {
				entraineur.setId_entraineur(Integer.parseInt(resultSet.getString(ID)));
				entraineur.setFirstname_entraineur(resultSet.getString(FIRSTNAME));
				entraineur.setLastname_entraineur(resultSet.getString(LASTNAME));
				entraineur.setId_club(Integer.parseInt(resultSet.getString(IDCLUB)));
				resultSet.close();
			}


			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return entraineur;
	}

	@Override
	public void DeleteAll() {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			statement.execute("DELETE FROM "
					+ DatabaseAccess.DB + "."+TABLE+";");

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
			statement.execute("DELETE FROM "
					+ DatabaseAccess.DB + "."+TABLE+" WHERE "+TABLE+"."+ID+" = " + id
					+ " ;");

			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Entraineur item) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			statement.execute("UPDATE "
					+ DatabaseAccess.DB + "."+TABLE+" SET "
					+" "+FIRSTNAME+" = '"+ item.getFirstname_entraineur() + "',"
					+" "+LASTNAME+" = '"+ item.getLastname_entraineur() + "',"
					+" "+IDCLUB+" = '"+ item.getId_club() + "'"
					+" WHERE "+TABLE+"."+ID+" = " + item.getId_entraineur()
					+";");

			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Insert(Entraineur item) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			statement.execute("INSERT INTO "
					+ DatabaseAccess.DB + "."+TABLE+" ("+FIRSTNAME+", "+LASTNAME+", "+IDCLUB+") VALUES "
					+"('" + item.getId_entraineur() + "', "
					+"'" + item.getFirstname_entraineur() + "', "
					+"'" + item.getLastname_entraineur() + "', "
					+"'" + item.getId_club() + "';");

			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

