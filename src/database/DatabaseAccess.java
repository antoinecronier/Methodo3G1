package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseAccess {
	private Connection connection = null;

	/** Instance unique pré-initialisée */
	private static DatabaseAccess INSTANCE = new DatabaseAccess();

	/** Point d'accès pour l'instance unique du singleton */
	public static DatabaseAccess getInstance()
	{	return INSTANCE;
	}

	private DatabaseAccess(){

	}

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if (connection == null)
				connection = DriverManager
						.getConnection("jdbc:mysql://localhost/Jeu_Foot?user=root&password=");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return connection;
	}
}
