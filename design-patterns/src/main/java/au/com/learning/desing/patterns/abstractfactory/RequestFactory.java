package au.com.learning.desing.patterns.abstractfactory;

import java.util.EnumMap;
import java.util.Map;

public class RequestFactory {

	private Map<RequestType, RequestProcessor> requestMap = new EnumMap<>(RequestType.class);
	
	public RequestFactory(RequestProcessor empFactory, RequestProcessor memFactory) {
		requestMap.put(RequestType.ENPLOYER_REQUEST, empFactory);
		requestMap.put(RequestType.MEMBER_REQUEST, memFactory);
	}
	
	public void getFactoryImplementationClass(String requestTypeStr) {
		RequestType requestType = RequestType.getValueOf(requestTypeStr);
		requestMap.get(requestType).processRequest(requestType);
	}
	
}
