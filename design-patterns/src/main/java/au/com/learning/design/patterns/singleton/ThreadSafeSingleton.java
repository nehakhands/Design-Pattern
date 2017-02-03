package au.com.learning.design.patterns.singleton;

public final class ThreadSafeSingleton {

	private static ThreadSafeSingleton threadSafeSingleton;
	
	private ThreadSafeSingleton() { 
		if (threadSafeSingleton == null) {
			synchronized (threadSafeSingleton) {
				threadSafeSingleton = new ThreadSafeSingleton();
			}
		}
	}
	
	public static ThreadSafeSingleton getInstance () {
		return threadSafeSingleton;
	}
}
