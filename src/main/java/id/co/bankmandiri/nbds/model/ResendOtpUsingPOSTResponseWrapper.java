package id.co.bankmandiri.nbds.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import id.co.bankmandiri.nbds.model.UserIdRequest;
import org.springframework.http.ResponseEntity;
import id.co.bankmandiri.nbds.model.LoginInitializationResponse;


public class ResendOtpUsingPOSTResponseWrapper {

	private LoginInitializationResponse response;
        
        private MultiValueMap<String,String> headers = new LinkedMultiValueMap<>();

        public MultiValueMap<String, String> getHeaders(){
            return this.headers;
	}

	public void setHeaders(MultiValueMap<String,String> headers){
            this.headers = headers;
	}
        
        public void addHeaders(String header, List<String> value) {
            headers.put(header, value);
        }
 
	public LoginInitializationResponse getResponse(){
            return response;
	}
 
	public void setResponse(LoginInitializationResponse response){
            this.response=response;
	}  
}
