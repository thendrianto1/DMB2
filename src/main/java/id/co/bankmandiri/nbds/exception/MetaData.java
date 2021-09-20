package id.co.bankmandiri.nbds.exception;

import java.util.HashMap;
import java.util.Map;

import id.co.bankmandiri.nbds.exception.ApiExceptionResponse;
import id.co.bankmandiri.nbds.exception.ErrorStatusCode;
import id.co.bankmandiri.nbds.model.*;

public class MetaData {

	public static final Map<String,Map<ErrorStatusCode, ApiExceptionResponse>> apiExceptions;
	
	static {		
		apiExceptions = new HashMap<String,Map<ErrorStatusCode, ApiExceptionResponse>>();

		Map<ErrorStatusCode, ApiExceptionResponse> responses; 
		try {
		
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,FingerprintResponse.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,FingerprintResponse.class,"Forbidden"));
		 
		 apiExceptions.put("fingerprintUsingPOST",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(401),ApiExceptionResponse.getInstance(401,Void.class,"Unauthorized"));
		 responses.put(ErrorStatusCode.getStatusCode(403),ApiExceptionResponse.getInstance(403,Void.class,"Forbidden"));
		 
		 apiExceptions.put("loginUsingPOST",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,MenuDTOResponse.class,"Menu Not Available"));
		 
		 apiExceptions.put("addNewMenuUsingPOST",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,RoleDTOResponse.class,"Failure Adding Role"));
		 
		 apiExceptions.put("addNewMenuUsingPOST1",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,RoleMenuDTOResponse.class,"Failure mapping rule and menu"));
		 
		 apiExceptions.put("addNewMenuUsingPOST2",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,UserBranchResponse.class,"Mapping Not Found"));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,UserBranchResponse.class,"Internal Error"));
		 
		 apiExceptions.put("getTellerListUsingGET",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,BranchTellerCounterResponse.class,"Mapping not found"));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,BranchTellerCounterResponse.class,"Internal Error"));
		 
		 apiExceptions.put("getLoggedInTellerUsingGET",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,UserBranchRoleDTOResponse.class,"Failure mapping User Branch and Role"));
		 
		 apiExceptions.put("addNewMenuUsingPOST3",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,GetTellerUserResponse.class,"Teller or User Not Found"));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,GetTellerUserResponse.class,"Internal Error"));
		 
		 apiExceptions.put("getTellerUserUsingGET",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,LoginResponse.class,"Teller or User Not Found"));
		 responses.put(ErrorStatusCode.getStatusCode(500),ApiExceptionResponse.getInstance(500,LoginResponse.class,"Internal Error"));
		 
		 apiExceptions.put("verifyUsingPOST",responses);
		 
		
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}
