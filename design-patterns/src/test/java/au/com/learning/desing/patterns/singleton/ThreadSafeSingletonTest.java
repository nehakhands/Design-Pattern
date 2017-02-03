package au.com.learning.desing.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

import au.com.learning.design.patterns.singleton.ThreadSafeSingleton;

public class ThreadSafeSingletonTest {

	@Test
	public void testSingleton() {
		ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton singleton1 = ThreadSafeSingleton.getInstance();
		Assert.assertEquals(singleton, singleton1);
	}
}
