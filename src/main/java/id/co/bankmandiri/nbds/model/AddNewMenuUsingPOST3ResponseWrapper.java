package id.co.bankmandiri.nbds.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import id.co.bankmandiri.nbds.model.UserBranchRoleDTORequest;
import org.springframework.http.ResponseEntity;
import id.co.bankmandiri.nbds.model.UserBranchRoleDTOResponse;


public class AddNewMenuUsingPOST3ResponseWrapper {

	private UserBranchRoleDTOResponse response;
        
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
 
	public UserBranchRoleDTOResponse getResponse(){
            return response;
	}
 
	public void setResponse(UserBranchRoleDTOResponse response){
            this.response=response;
	}  
}
