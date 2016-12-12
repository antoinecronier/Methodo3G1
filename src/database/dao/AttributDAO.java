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

public class AttributDAO implements IGenericDAO<Attribut> {

	@Override
	public ArrayList<Attribut> SelectAll() {
		List<Attribut> attributs = new LinkedList<Attribut>();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + ".Attribut ;");

			Attribut attribut = null;
			while (resultSet.next()) {
				attribut = new Attribut();
				attribut.setAttribut_id(Integer.parseInt(resultSet
						.getString("id_types")));
				attribut.setName(resultSet.getString("nom"));
				attribut.setValue(Integer.parseInt(resultSet
						.getString("id_types")));
				attributs.add(attribut);
			}
			resultSet.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<Attribut> returnAttributs = new ArrayList<Attribut>(attributs);
		return returnAttributs;
	}

	@Override
	public Attribut Select(Integer id) {
		Attribut attribut = new Attribut();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + ".Attribut " + "WHERE Attribut. = "
					+ id + ";");

			resultSet.next();

			attribut.setAttribut_id(Integer.parseInt(resultSet
					.getString("id_types")));
			attribut.setName(resultSet.getString("nom"));
			attribut.setValue(Integer.parseInt(resultSet.getString("id_types")));

			resultSet.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return attribut;
	}

	@Override
	public void DeleteAll() {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("DELETE FROM "
					+ DatabaseAccess.DB + ".Attribut;");

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
					+ DatabaseAccess.DB + ".Attribut WHERE Attribut. = " + id
					+ " ;");

			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Attribut item) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("UPDATE "
					+ DatabaseAccess.DB + ".Attribut SET "
					+" att1 = "+ 1 + ","
					+" att2 = "+ 1 + ""
					+" WHERE Attribut.id = " + item.getAttribut_id()
					+";");

			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Insert(Attribut item) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("INSERT INTO "
					+ DatabaseAccess.DB + ".Attribut () VALUES "
					+"("+ 1 + "," + 2 + ")"+
					";");

			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
