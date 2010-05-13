/**
 * @author Sumit Khanna - PenguinDreams.org
 */
package org.penguindreams.pdbimpy.base;

public class SimpleException extends Exception {

	private Throwable nestedException;
	
	public SimpleException(String s) {
		super(s);
	}
	
	public SimpleException(String s, Exception nestedException) {
		super(s);
		this.nestedException = nestedException;		
	}
	
	public Throwable getNestedException() {
		return this.nestedException;
	}
	
}
