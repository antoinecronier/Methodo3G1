package database.dao;

import entite.Attribut;
import entite.Club;
import entite.Joueur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import database.DatabaseAccess;
import database.IGenericDAO;

public class ClubDAO implements IGenericDAO<Club>{
	
	public final static String ID = "id_club";
	public final static String NAME = "name";
	public final static String MONEY = "club_money";
	public final static String TABLE = "Club";

	@Override
	public ArrayList<Club> SelectAll() {
		List<Club> clubs = new LinkedList<Club>();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" ;");

			Club club = null;
			while (resultSet.next()) {
				club = new Club();
				club.setId_club(Integer.parseInt(resultSet
						.getString(ID)));
				club.setName(resultSet.getString(NAME));
				club.setClub_money(Integer.parseInt(resultSet.getString(MONEY)));
				clubs.add(club);
			}
			resultSet.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		ArrayList<Club> returnClubs = new ArrayList<Club>(clubs);
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

					+ DatabaseAccess.DB + "."+TABLE+" " + "WHERE Club. = "

					+ id + ";");

			resultSet.next();
			clubs.setId_club(Integer.parseInt(resultSet
					.getString(ID)));
			clubs.setName(resultSet.getString(NAME));

			clubs.setId_club(Integer.parseInt(resultSet
					.getString(ID)));
			clubs.setName(resultSet.getString(NAME));
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clubs;
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
	public void Update(Club item) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("UPDATE "
					+ DatabaseAccess.DB + "."+TABLE+" SET "
					+" "+NAME+" = "+ item.getName() + ""
					+" WHERE "+TABLE+"."+ID+" = " + item.getId_club()
					+";");

			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Insert(Club item) {
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
