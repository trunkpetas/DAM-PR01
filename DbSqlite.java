import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSqlite {


	private static DbSqlite instance;

	private DbSqlite() {
		this.init();
	}

	public static DbSqlite getInstance() {
		if (instance == null) {
			instance = new DbSqlite();
		}
		return instance;
	}

	private void checkDbFiles() {
		boolean fileExist = false;
		System.out.println("Comprobando Bases de datos");

		File path = new File(Config.PATHDB);

		if (!path.exists()) {
			path.mkdirs();

		}
		File db = new File(path, Config.DBNAME);
		if (db.exists()) {
			System.out.println("Bases de datos ya creadas");
			this.init();
			return;
		}
		System.out.println("Creando Bases de datos");

		try {
			if (db.createNewFile()) {
				fileExist = true;

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			if (fileExist) {
				System.out.println("Bases de datos, creada");
				this.init();
			}

		}

	}

	public void init() {

		Connection conn = null;
		try {
			// db parameters
			String url = "jdbc:sqlite:" + Config.PATHDB + Config.DBNAME;
			// create a connection to the database
			conn = DriverManager.getConnection(url);

			System.out.println("Connection to SQLite has been established.");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.checkDbFiles();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	

}
