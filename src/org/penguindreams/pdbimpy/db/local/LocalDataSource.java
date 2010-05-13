package org.penguindreams.pdbimpy.db.local;

import java.io.PrintWriter;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

class LocalDataSource implements DataSource , Serializable {


	private static final long serialVersionUID = 1L;
	
	private String connectionString;
    private String username;
    private String password;
    
    LocalDataSource(String connectionString, String username, String password) {
        this.connectionString = connectionString;
        this.username = username;
        this.password = password;
    }
    
    public Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(connectionString, username, password);
    }

	public Connection getConnection(String username, String password)
			throws SQLException {return null;}

	public PrintWriter getLogWriter() throws SQLException {return null;}

	public int getLoginTimeout() throws SQLException {return 0;}

	public void setLogWriter(PrintWriter out) throws SQLException {	}

	public void setLoginTimeout(int seconds) throws SQLException {}

}
