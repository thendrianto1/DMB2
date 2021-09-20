package id.co.bankmandiri.nbds.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import id.co.bankmandiri.nbds.model.RoleMenuDTORequest;
import org.springframework.http.ResponseEntity;
import id.co.bankmandiri.nbds.model.RoleMenuDTOResponse;


public class AddNewMenuUsingPOST2ResponseWrapper {

	private RoleMenuDTOResponse response;
        
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
 
	public RoleMenuDTOResponse getResponse(){
            return response;
	}
 
	public void setResponse(RoleMenuDTOResponse response){
            this.response=response;
	}  
}
