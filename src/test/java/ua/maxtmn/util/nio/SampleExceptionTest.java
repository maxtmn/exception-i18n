package ua.maxtmn.util.nio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import ua.maxtmn.util.lang.AbstractRichException;

public class SampleExceptionTest {

	AbstractRichException target = new SampleException();

	@Test
	public void testCode() {
		String code = target.code();
		assertNotNull(code);
		assertEquals("E00002", code);
	}
	
	@Test
	public void testShortMessage() {
		String mess = target.shortMessage();
		assertNotNull(mess);
		assertEquals("very useful information about error cause", mess);
	}
	
	@Test(expected = Exception.class)
	public void testThrow() throws AbstractRichException {
		throw target; 
	}
	
	@Test(expected = SampleException.class)
	public void testThrowCustom() throws AbstractRichException {
		throw target;
	}
	
}
