package ua.maxtmn.util.nio;

import java.text.MessageFormat;

import ua.maxtmn.util.CompilationErrors;
import ua.maxtmn.util.lang.AbstractRichException;

public class SampleException extends AbstractRichException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SampleException() {
		this.codeable = CompilationErrors.SAMPLE;
		this.mesageFormat = new MessageFormat(this.codeable.messagePattern());
	}
	
	public String shortMessage() {
		return mesageFormat.format(new Object[] {});
	}

}
