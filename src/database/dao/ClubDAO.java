package database.dao;

import entite.Attribut;
import entite.Club;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import database.DatabaseAccess;
import database.IGenericDAO;

public class ClubDAO implements IGenericDAO<Club>{
	
	public final static String ID = "club_id";
	public final static String NAME = "name";
	public final static Integer MONEY = money;
	public final static Integer TOTAL_POINTS = totalPoints;
	public final static String TABLE = "Club";

	@Override
	public ArrayList<ClubDAO> SelectAll() {
		List<Attribut> clubs = new LinkedList<Attribut>();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" ;");

			Club club = null;
			while (resultSet.next()) {
				club = new Club();
				club.setClub_id(Integer.parseInt(resultSet
						.getString(ID)));
				club.setName(resultSet.getString(NAME));
				clubs.add(club);
			}
			resultSet.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<Club> returnAttributs = new ArrayList<Club>(clubs);
		return returnClubs;
	}

	@Override
	public Club Select(Integer id) {
		Club clubs = new Club();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" " + "WHERE Club. = "
					+ id + ";");

			resultSet.next();

			club.setAttribut_id(Integer.parseInt(resultSet
					.getString(ID)));
			club.setName(resultSet.getString(NAME));

			resultSet.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return club;
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
					+ DatabaseAccess.DB + ".Attribut WHERE "+TABLE+"."+ID+" = " + id
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
					+ DatabaseAccess.DB + "."+TABLE+" SET "
					+" "+NAME+" = "+ item.getName() + ""
					+" WHERE "+TABLE+"."+ID+" = " + item.getAttribut_id()
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
					+ DatabaseAccess.DB + "."+TABLE+" () VALUES "
					+"(null," + item.getName() + ")"+
					";");

			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
