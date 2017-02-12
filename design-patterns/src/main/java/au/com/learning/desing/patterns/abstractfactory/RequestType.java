package au.com.learning.desing.patterns.abstractfactory;

public enum RequestType {
	MEMBER_REQUEST, ENPLOYER_REQUEST, NONE;
	
	public static RequestType getValueOf(String reqType) {
		RequestType requestType;
		switch(reqType.toUpperCase()) {
			case "EMPLOYER" : 
				requestType = ENPLOYER_REQUEST;
				break;
			case "MEMBER" :
				requestType = MEMBER_REQUEST;
				break;
			default :
				requestType = NONE;
				break;
		}
		return requestType;
	}
}
