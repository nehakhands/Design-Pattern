package au.com.learning.design.patterns.singleton;

public enum EnumSingleton {

	INSTANCE;
	
	public int hashcode() {
		return INSTANCE.hashCode();
	}
}
