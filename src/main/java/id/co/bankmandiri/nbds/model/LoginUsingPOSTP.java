package id.co.bankmandiri.nbds.model;

import id.co.bankmandiri.nbds.model.LoginRequest;
import org.springframework.http.ResponseEntity;

public class LoginUsingPOSTP {

    private LoginRequest loginRequest;

    public LoginUsingPOSTP() {

    }

    public LoginUsingPOSTP(LoginRequest loginRequest) {
        this.loginRequest = loginRequest;
    }

    public LoginRequest getLoginRequest () {
        return loginRequest;
    }

    public void setLoginRequest (LoginRequest loginRequest) {
        this.loginRequest = loginRequest;
    }

}
