package ua.maxtmn.util;

import java.util.Locale;
import java.util.ResourceBundle;

public enum CompilationErrors implements ErrorCodeable {
	/**
	 * 
	 */
	SAMPLE,
	/**
	 * arg[0] - file name
	 */
	FILE_NAME_VIOLATION
	;

	private ResourceBundle messages = ResourceBundle.getBundle("CompilationErrorMessages",
			Locale.getDefault());
	
	public String messagePattern() {
		return messages.getString(this.name() + ".message");
	}

	public String code() {
		return messages.getString(this.name() + ".code");
	}

}
