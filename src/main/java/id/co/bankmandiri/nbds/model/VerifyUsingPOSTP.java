package id.co.bankmandiri.nbds.model;

import id.co.bankmandiri.nbds.model.VerificationRequest;
import org.springframework.http.ResponseEntity;
import id.co.bankmandiri.nbds.model.LoginResponse;

public class VerifyUsingPOSTP {

    private VerificationRequest verificationRequest;

    public VerifyUsingPOSTP() {

    }

    public VerifyUsingPOSTP(VerificationRequest verificationRequest) {
        this.verificationRequest = verificationRequest;
    }

    public VerificationRequest getVerificationRequest () {
        return verificationRequest;
    }

    public void setVerificationRequest (VerificationRequest verificationRequest) {
        this.verificationRequest = verificationRequest;
    }

}
