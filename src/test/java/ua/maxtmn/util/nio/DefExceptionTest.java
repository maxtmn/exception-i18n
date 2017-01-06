package ua.maxtmn.util.nio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ua.maxtmn.util.lang.AbstractRichException;

public class DefExceptionTest {

	AbstractRichException target = new DefException();

	@Test
	public void testCode() {
		String code = target.code();
		assertNotNull(code);
		assertEquals("NOTDEF", code);
	}

	@Test
	public void testShortMessage() {
		String code = target.shortMessage();
		assertNotNull(code);
		assertEquals("TOOO write error description!!!", code);
	}

	@Test(expected = Exception.class)
	public void testThrow() throws Exception {
		throw target;
	}

	@Test(expected = DefException.class)
	public void testThrowCustom() throws AbstractRichException {
		throw target;
	}

}
