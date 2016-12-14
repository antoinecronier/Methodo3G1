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


public class PossedeDAO implements IGenericDAO<Joueur> {
	
	public final static String TABLE = "Posseder";
	public final static String ID_JOUEUR = "id_joueur";
	public final static String ID_ATTRIBUT = "id_attribut";
	public final static String VALEUR = "valeur";

	@Override
	public ArrayList<Joueur> SelectAll() {
		// TODO Auto-generated method stub
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
+ DatabaseAccess.DB + "."+JoueurDAO.TABLE+" INNER JOIN "+TABLE+" ON "+JoueurDAO.ID+" = "+ID_JOUEUR+
							" INNER JOIN "+AttributDAO.TABLE+" ON "+AttributDAO.ID+" = "+ID_JOUEUR+";");
			
			Joueur joueur = null;
			while (resultSet.next()) {
				joueur = new Joueur();
				joueur.setId_joueur(Integer.parseInt(resultSet
						.getString(ID_JOUEUR)));
				joueur.setId_joueur(resultSet.getString(0));
			}
			resultSet.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		ArrayList<Joueur> returnJoueur = new ArrayList<Joueur>();
		return returnJoueur;
		}		
		
	

	@Override
	public Joueur Select(Integer id) {
		// TODO Auto-generated method stub
		Joueur joueur = new Joueur();
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM "
					+ DatabaseAccess.DB + "."+TABLE+" " + "WHERE Joueur. = "
					+ id + ";");

			resultSet.next();

			joueur.setId_joueur(Integer.parseInt(resultSet
					.getString(ID_JOUEUR)));
			

			resultSet.close();
			statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public void DeleteAll() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			statement.execute("DELETE FROM "
					+ DatabaseAccess.DB + "."+TABLE+" WHERE "+TABLE+"."+ID_JOUEUR+" = " + id
					+ " ;");

			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void Update(Joueur item) {
		// TODO Auto-generated method stub
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			ResultSet resultSet1 = statement.executeQuery("UPDATE "
					+ DatabaseAccess.DB + "."+TABLE+" SET "
					+" "+ID_ATTRIBUT+" = "+ item.getId_joueur() + ""
					+" WHERE "+TABLE+"."+ID_JOUEUR+" = " + item.getId_joueur()
					+";");
			
			resultSet1.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void Insert(Joueur item) {
		// TODO Auto-generated method stub
		try {
			Statement statement = DatabaseAccess.getConnection()
					.createStatement();
			statement.execute("INSERT INTO "
					+ DatabaseAccess.DB + "."+VALEUR+" ("+AttributDAO.TABLE+") VALUES "
					+"('" + item.getAttribut() + "')"+
					";");

			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
