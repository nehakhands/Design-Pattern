package au.com.learning.desing.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

import au.com.learning.design.patterns.singleton.EnumSingleton;

public class EnumSingletonTest {

	@Test
	public void testSingleton() {
		EnumSingleton singetonEnum = EnumSingleton.INSTANCE;
		EnumSingleton singetonEnum1 = EnumSingleton.INSTANCE;
		
		Assert.assertEquals(singetonEnum, singetonEnum1);
	}
}
