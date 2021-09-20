package id.co.bankmandiri.nbds.model;

import id.co.bankmandiri.nbds.model.UserIdRequest;
import org.springframework.http.ResponseEntity;
import id.co.bankmandiri.nbds.model.LoginInitializationResponse;

public class ResendOtpUsingPOSTP {

    private UserIdRequest userIdRequest;

    public ResendOtpUsingPOSTP() {

    }

    public ResendOtpUsingPOSTP(UserIdRequest userIdRequest) {
        this.userIdRequest = userIdRequest;
    }

    public UserIdRequest getUserIdRequest () {
        return userIdRequest;
    }

    public void setUserIdRequest (UserIdRequest userIdRequest) {
        this.userIdRequest = userIdRequest;
    }

}
