package org.penguindreams.pdbimpy.db.local;

import java.util.HashMap;

import javax.naming.spi.NamingManager;

import org.penguindreams.pdbimpy.base.SimpleException;

public class LocalContextFactory {
	

	/**
	 * do not instantiate this class directly. Use the factory method.
	 */
	private LocalContextFactory() {}
	
	
	public static LocalContext createLocalContext(String databaseDriver) throws SimpleException {

		try { 
			LocalContext ctx = new LocalContext();
			Class.forName(databaseDriver);
	
			NamingManager.setInitialContextFactoryBuilder(ctx); 			
			return ctx;
		}
		catch(Exception e) {
			throw new SimpleException("Error Initializing Context: " + e.getMessage(),e);
		}
	}
	


	
	
}
