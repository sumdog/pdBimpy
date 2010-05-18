package org.penguindreams.pdbimpy.util;

public class ReflectionUtils {

    /**
     * Returns the name of a class without package name.
     * @param c Class to determine name of
     * @return String with just the class name
     */
      public String getClassName(Class<?> c) {
		String FQClassName = c.getName();
		int firstChar;
		firstChar = FQClassName.lastIndexOf('.') + 1;
		if (firstChar > 0) {
			FQClassName = FQClassName.substring(firstChar);
		}
		return FQClassName;
      }

	
}
