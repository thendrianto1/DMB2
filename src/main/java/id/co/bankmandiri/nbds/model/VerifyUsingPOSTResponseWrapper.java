package id.co.bankmandiri.nbds.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import id.co.bankmandiri.nbds.model.VerificationRequest;
import org.springframework.http.ResponseEntity;
import id.co.bankmandiri.nbds.model.LoginResponse;


public class VerifyUsingPOSTResponseWrapper {

	private LoginResponse response;
        
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
 
	public LoginResponse getResponse(){
            return response;
	}
 
	public void setResponse(LoginResponse response){
            this.response=response;
	}  
}