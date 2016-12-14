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

	public final static String ID = "id_attribut";
	public final static String NAME = "name_attribut";
	public final static String TABLE = "Attribut";

	@Override
	public ArrayList<Attribut> SelectAll() {
		List<Attribut> attributs = new LinkedList<Attribut>();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" ;");

			Attribut attribut = null;
			while (resultSet.next()) {
				attribut = new Attribut();
				attribut.setAttribut_id(Integer.parseInt(resultSet
						.getString(ID)));
				attribut.setName(resultSet.getString(NAME));
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
					+ DatabaseAccess.DB + "."+TABLE+" " + "WHERE "+TABLE+"."+ID+" = "
					+ id + ";");

			if (resultSet.next() != false) {
				attribut.setAttribut_id(Integer.parseInt(resultSet
						.getString(ID)));
				attribut.setName(resultSet.getString(NAME));
				resultSet.close();
			}


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
	public void Update(Attribut item) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			statement.execute("UPDATE "
					+ DatabaseAccess.DB + "."+TABLE+" SET "
					+" "+NAME+" = '"+ item.getName() + "'"
					+" WHERE "+TABLE+"."+ID+" = " + item.getAttribut_id()
					+";");

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
