package ua.maxtmn.util.nio;

import static org.junit.Assert.*;

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
		String code = target.shortMessage();
		assertNotNull(code);
		assertEquals("very useful information about error cause", code);
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
