package ua.maxtmn.util.nio;

import java.text.MessageFormat;

import ua.maxtmn.util.CompilationErrors;
import ua.maxtmn.util.lang.AbstractRichException;

public class WrongFileNameException extends AbstractRichException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String filePath;

	public WrongFileNameException(String filePath) {
		this.codeable = CompilationErrors.FILE_NAME_VIOLATION;
		this.mesageFormat = new MessageFormat(this.codeable.messagePattern());
		this.filePath = filePath;
	}

	public String shortMessage() {
		return mesageFormat.format(new Object[] { filePath });
	}

}
