package com.howtoclicks.junitguide;

import static org.junit.Assert.assertSame;

import org.junit.jupiter.api.Test;

public class AssertSameTest {
	@Test
	public void testAssertSame() {
		System.out.println("Start Junit Test..");
		
		String a1 = "TEST1";
		String a2 = new String("TEST1");
		
		assertSame("Error! test fail: ", a1, a2);
	}
}
