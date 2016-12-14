package management;

import database.dao.AttributDAO;
import entite.Attribut;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AttributDAO attDAO = new AttributDAO();

		for (Attribut att : attDAO.SelectAll()) {
			System.out.println(att.getName());
		}
	}

}
