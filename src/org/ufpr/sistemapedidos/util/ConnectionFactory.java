package org.ufpr.sistemapedidos.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 
 * @author Caio Calo
 */
public class ConnectionFactory {

	public static Connection create() throws SQLException, IOException {

		FileInputStream file = new FileInputStream(new File("dados.properties"));
		Properties properties = new Properties();
		properties.load(file);

		String url = properties.getProperty("prop.db.url");
		String user = properties.getProperty("prop.db.user");
		String password = properties.getProperty("prop.db.password");

		return DriverManager.getConnection(url, user, password);

	}

}
