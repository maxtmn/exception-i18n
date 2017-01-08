package ua.maxtmn.util.nio;

import ua.maxtmn.util.CompilationErrors;
import ua.maxtmn.util.lang.AbstractRichException;

public class SampleException extends AbstractRichException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SampleException() {
		this.codeable = CompilationErrors.SAMPLE;
	}

}
