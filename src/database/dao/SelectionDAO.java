package database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import database.DatabaseAccess;
import database.IGenericDAO;
import entite.Selection;

public class SelectionDAO implements IGenericDAO<Selection> {

	public final static String ID = "id_selection";
	public final static String IDMATCH = "id_match";
	public final static String IDCLUB = "id_club";
	public final static String TABLE = "Selection";

	@Override
	public ArrayList<Selection> SelectAll() {
		List<Selection> selections = new LinkedList<Selection>();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" ;");

			Selection selection = null;
			while (resultSet.next()) {
				selection = new Selection();
				selection.setId_selection(Integer.parseInt(resultSet
						.getString(ID)));
				selection.setId_match(Integer.parseInt(resultSet
						.getString(IDMATCH)));
				selection.setId_club(Integer.parseInt(resultSet
						.getString(IDCLUB)));
				selections.add(selection);
			}
			resultSet.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<Selection> returnSelections = new ArrayList<Selection>(selections);
		return returnSelections;
	}

	@Override
	public Selection Select(Integer id) {
		Selection selection = new Selection();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" " + "WHERE "+TABLE+"."+ID+" = "
					+ id + ";");

			if (resultSet.next() != false) {
				selection.setId_selection(Integer.parseInt(resultSet
						.getString(ID)));
				selection.setId_match(Integer.parseInt(resultSet
						.getString(IDMATCH)));
				selection.setId_club(Integer.parseInt(resultSet
						.getString(IDCLUB)));
				resultSet.close();
			}


			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return selection;
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
	public void Update(Selection item) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			statement.execute("UPDATE "
					+ DatabaseAccess.DB + "."+TABLE+" SET "
					+" "+IDMATCH+" = '"+ item.getId_match() + "',"
					+" "+IDMATCH+" = '"+ item.getId_club() + "'"
					+" WHERE "+TABLE+"."+ID+" = " + item.getId_selection()
					+";");

			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Insert(Selection item) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			statement.execute("INSERT INTO "
					+ DatabaseAccess.DB + "."+TABLE+" ("+IDMATCH+","+IDCLUB+") VALUES "
					+"('" + item.getId_match() + "','" + item.getId_club() + "';");

			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
}
