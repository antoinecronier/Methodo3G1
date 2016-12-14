package database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import database.DatabaseAccess;
import database.IGenericDAO;
import entite.Match;

public class MatchDAO implements IGenericDAO<Match> {

	public final static String ID = "match_id";
	public final static String NAME = "name";
	public final static String TABLE = "Saison";

	@Override
	public ArrayList<Match> SelectAll() {
		List<Match> matchs = new LinkedList<Match>();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" ;");

			Match match = null;
			while (resultSet.next()) {
				match = new Match();
				match.setMatch_id(Integer.parseInt(resultSet
						.getString(ID)));
				match.setName(resultSet.getString(NAME));
				matchs.add(match);
			}
			resultSet.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<Match> returnMatchs = new ArrayList<Match>(matchs);
		return returnMatchs;
	}

	@Override
	public Match Select(Integer id) {
		Match match = new Match();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" " + "WHERE "+TABLE+"."+ID+" = "
					+ id + ";");

			if (resultSet.next() != false) {
				match.setMatch_id(Integer.parseInt(resultSet
						.getString(ID)));
				match.setName(resultSet.getString(NAME));
				resultSet.close();
			}


			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return match;
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
	public void Update(Match item) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			statement.execute("UPDATE "
					+ DatabaseAccess.DB + "."+TABLE+" SET "
					+" "+NAME+" = '"+ item.getName() + "'"
					+" WHERE "+TABLE+"."+ID+" = " + item.getMatch_id()
					+";");

			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Insert(Match item) {
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
