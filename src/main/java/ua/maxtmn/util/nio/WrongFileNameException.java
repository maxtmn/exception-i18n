package ua.maxtmn.util.nio;

import ua.maxtmn.util.CompilationErrors;
import ua.maxtmn.util.lang.AbstractRichException;

public class WrongFileNameException extends AbstractRichException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WrongFileNameException(String filePath) {
		this.codeable = CompilationErrors.FILE_NAME_VIOLATION;
		this.messageArgs.add(filePath);
	}

}
