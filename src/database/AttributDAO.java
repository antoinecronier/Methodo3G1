package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import entite.Attribut;

public class AttributDAO implements IGenericDAO<Attribut> {

	@Override
	public ArrayList<Attribut> SelectAll() {
		List<Attribut> attributs = new LinkedList<Attribut>();
        try {
               Statement statement = DatabaseAccess.getConnection().createStatement();
               ResultSet resultSet = statement.executeQuery("SELECT * FROM " + DatabaseAccess.DB + ".Attribut ;");

               Attribut attribut = null;
               while(resultSet.next()){
            	   attribut = new Attribut();
            	   attribut.setAttribut_id(Integer.parseInt(resultSet.getString("id_types")));
            	   attribut.setName(resultSet.getString("nom"));
            	   attribut.setValue(Integer.parseInt(resultSet.getString("id_types")));
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
		List<Attribut> attributs = new LinkedList<Attribut>();
        try {
               Statement statement = DatabaseAccess.getConnection().createStatement();
               ResultSet resultSet = statement.executeQuery("SELECT * FROM " + DatabaseAccess.DB + ".Attribut ;");

               Attribut attribut = null;
               while(resultSet.next()){
            	   attribut = new Attribut();
            	   attribut.setAttribut_id(Integer.parseInt(resultSet.getString("id_types")));
            	   attribut.setName(resultSet.getString("nom"));
            	   attribut.setValue(Integer.parseInt(resultSet.getString("id_types")));
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
	public void DeleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Update(Attribut item) {
		// TODO Auto-generated method stub

	}

	@Override
	public Attribut Insert(Attribut item) {
		// TODO Auto-generated method stub
		return null;
	}

}
