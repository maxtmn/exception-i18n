package ua.maxtmn.util.nio;

import static org.junit.Assert.*;

import org.junit.Test;

import ua.maxtmn.util.lang.AbstractRichException;

public class WrongFileNameExceptionTest {

	AbstractRichException target = new WrongFileNameException("C://badLocation");

	@Test
	public void testCode() {
		String code = target.code();
		assertNotNull(code);
		assertEquals("E00001", code);
	}

	@Test
	public void testShortMessage() {
		String code = target.shortMessage();
		assertNotNull(code);
		assertEquals("bad file name C://badLocation", code);
	}

	@Test(expected = Exception.class)
	public void testThrow() throws AbstractRichException {
		throw target;
	}

	@Test(expected = WrongFileNameException.class)
	public void testThrowCustom() throws AbstractRichException {
		throw target;
	}

}
