package database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import database.DatabaseAccess;
import database.IGenericDAO;
import entite.Saison;

public class SaisonDAO implements IGenericDAO<Saison> {

	public final static String ID = "saison_id";
	public final static String NAME = "name";
	public final static String TABLE = "Saison";

	@Override
	public ArrayList<Saison> SelectAll() {
		List<Saison> saisons = new LinkedList<Saison>();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" ;");

			Saison saison = null;
			while (resultSet.next()) {
				saison = new Saison();
				saison.setSaison_id(Integer.parseInt(resultSet
						.getString(ID)));
				saison.setName(resultSet.getString(NAME));
				saisons.add(saison);
			}
			resultSet.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<Saison> returnSaisons = new ArrayList<Saison>(saisons);
		return returnSaisons;
	}

	@Override
	public Saison Select(Integer id) {
		Saison saison = new Saison();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" " + "WHERE "+TABLE+"."+ID+" = "
					+ id + ";");

			if (resultSet.next() != false) {
				saison.setSaison_id(Integer.parseInt(resultSet
						.getString(ID)));
				saison.setName(resultSet.getString(NAME));
				resultSet.close();
			}


			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return saison;
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
	public void Update(Saison item) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			statement.execute("UPDATE "
					+ DatabaseAccess.DB + "."+TABLE+" SET "
					+" "+NAME+" = '"+ item.getName() + "'"
					+" WHERE "+TABLE+"."+ID+" = " + item.getSaison_id()
					+";");

			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Insert(Saison item) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			statement.execute("INSERT INTO "
					+ DatabaseAccess.DB + "."+TABLE+" ("+NAME+") VALUES "
					+"('" + item.getName() + "')"+
					";");

			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
