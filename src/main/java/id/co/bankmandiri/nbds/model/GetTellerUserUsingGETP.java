package id.co.bankmandiri.nbds.model;

import org.springframework.http.ResponseEntity;
import id.co.bankmandiri.nbds.model.GetTellerUserResponse;

public class GetTellerUserUsingGETP {

    private String userId;

    public GetTellerUserUsingGETP() {

    }

    public GetTellerUserUsingGETP(String userId) {
        this.userId = userId;
    }

    public String getUserId () {
        return userId;
    }

    public void setUserId (String userId) {
        this.userId = userId;
    }

}
