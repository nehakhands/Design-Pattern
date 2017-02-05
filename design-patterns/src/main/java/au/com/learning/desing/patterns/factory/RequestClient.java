package au.com.learning.desing.patterns.factory;

import java.util.EnumMap;
import java.util.Map;

public class RequestClient {

	private Map<RequestType, RequestFactory> requestMap = new EnumMap<>(RequestType.class);
	
	public RequestClient(RequestFactory empFactory, RequestFactory memFactory) {
		requestMap.put(RequestType.ENPLOYER_REQUEST, empFactory);
		requestMap.put(RequestType.MEMBER_REQUEST, memFactory);
	}
	
	public void getFactoryImplementationClass(String requestTypeStr) {
		RequestType requestType = RequestType.getValueOf(requestTypeStr);
		requestMap.get(requestType).processRequest(requestType);
	}
	
}
