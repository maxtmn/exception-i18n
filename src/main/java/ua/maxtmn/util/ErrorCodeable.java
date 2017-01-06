package ua.maxtmn.util;

/**
 * implementation contains: error code and message pattern
 * 
 * @author User
 *
 */
public interface ErrorCodeable {

	/**
	 * Error code 
	 * @return erroCode
	 */
	String code();

	/**
	 * Error message pattern. </br>
	 * To be used with <b>java.text.MessageFormat</b>
	 * @return message pattern
	 */
	String messagePattern();

}
