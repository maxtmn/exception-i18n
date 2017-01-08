package ua.maxtmn.util.lang;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import ua.maxtmn.util.ErrorCodeable;

/**
 * Abstraction for representing Custom exceptions
 * 
 * @author User
 *
 */
public abstract class AbstractRichException extends Exception implements
		RichException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected ErrorCodeable codeable;

	protected List<String> messageArgs = new ArrayList<>();

	@Override
	public String code() {
		return null == codeable ? "NOTDEF" : codeable.code();
	}

	@Override
	public String shortMessage() {
		return null == codeable ? "NOMESS" : new MessageFormat(
				this.codeable.messagePattern()).format(messageArgs.toArray());
	}

	public String getMessage() {
		StringBuilder mess = new StringBuilder();
		mess.append(System.lineSeparator());
		mess.append(this.code());
		mess.append(System.lineSeparator());
		mess.append(this.shortMessage());
		mess.append(System.lineSeparator());
		if (null != getCause()) {
			mess.append(super.getMessage());
		}
		return mess.toString();
	}

}
