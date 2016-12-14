package management;

import java.util.ArrayList;

import database.dao.AttributDAO;
import entite.Attribut;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AttributDAO attDAO = new AttributDAO();

		System.out.println("DB full select attributs");
		ArrayList<Attribut> attList = attDAO.SelectAll();
		for (Attribut att : attList) {
			System.out.println("	"+att.getName_attribut());
		}

		System.out.println();

		System.out.println("DB select attributs");
		Attribut attTest = attDAO.Select(attList.get(1).getId_attribut());
		System.out.println(attTest.getName_attribut());

		System.out.println();

		System.out.println("Update item");
		attTest.setName_attribut("new name test 1");
		attDAO.Update(attTest);
		System.out.println(attDAO.Select(attTest.getId_attribut()).getName_attribut());

		System.out.println();

		System.out.println("Delete item");
		attDAO.Delete(3);
		System.out.println(attDAO.Select(attTest.getId_attribut()).getName_attribut());

		System.out.println();

		System.out.println("Delete all items");
		attDAO.DeleteAll();
		for (Attribut att : attDAO.SelectAll()) {
			System.out.println("	"+att.getName_attribut());
		}

		System.out.println();

		System.out.println();

		System.out.println("Insert new item");
		Attribut item = new Attribut();
		item.setName_attribut("test1");
		attDAO.Insert(item);
		for (Attribut att : attDAO.SelectAll()) {
			System.out.println("	"+att.getName_attribut());
		}

		for (Attribut attribut : attList) {
			attDAO.Insert(attribut);
		}
	}

}
