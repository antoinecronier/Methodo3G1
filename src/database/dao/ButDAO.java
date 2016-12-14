package database.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import database.DatabaseAccess;
import database.IGenericDAO;
import entite.But;


public class ButDAO implements IGenericDAO<But> {
	public final static String ID = "id_but";
	public final static String ATTIME = "atTime";
	public final static String IDMATCH = "id_match";
	public final static String IDJOUEUR = "id_joueur";
	public final static String TABLE = "But";
	
	@Override
	public ArrayList<But> SelectAll() {
		List<But> buts = new LinkedList<But>();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" ;");

			But but = null;
			while (resultSet.next()) {
				but = new But();
				but.setId_but(Integer.parseInt(resultSet
						.getString(ID)));
				but.setAtTime(resultSet.getTime(ATTIME));
				but.setId_match(Integer.parseInt(IDMATCH));
				but.setId_joueur(Integer.parseInt(IDJOUEUR));
				buts.add(but);
			}
			resultSet.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<But> returnButs = new ArrayList<But>(buts);
		return returnButs;
	}

	@Override
	public But Select(Integer id) {
		But but = new But();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" " + "WHERE "+TABLE+"."+ID+" = "
					+ id + ";");

			if (resultSet.next() != false) {
				but.setId_but(Integer.parseInt(resultSet
						.getString(ID)));
				but.setAtTime(resultSet.getTime(ATTIME));
				but.setId_match(Integer.parseInt(IDMATCH));
				but.setId_joueur(Integer.parseInt(IDJOUEUR));
				resultSet.close();
			}


			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return but;
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
	public void Update(But item) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			statement.execute("UPDATE "
					+ DatabaseAccess.DB + "."+TABLE+" SET "
					+" "+ATTIME+" = '"+ item.getAtTime() + "',"
					+" "+IDMATCH+" = '"+ item.getId_match() + "',"
					+" "+IDJOUEUR+" = '"+ item.getId_joueur() + "'"
					+" WHERE "+TABLE+"."+ID+" = " + item.getId_but()
					+";");

			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Insert(But item) {
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			statement.execute("INSERT INTO "
					+ DatabaseAccess.DB + "."+TABLE+" ("+ATTIME+", "+IDMATCH+", "+IDJOUEUR+") VALUES "
					+" "+ATTIME+" = '"+ item.getAtTime() + "',"
					+" "+IDMATCH+" = '"+ item.getId_match() + "',"
					+" "+IDJOUEUR+" = '"+ item.getId_joueur() + "'"
					+" WHERE "+TABLE+"."+ID+" = " + item.getId_but()
					+	";");

			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

