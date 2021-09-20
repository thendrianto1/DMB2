package id.co.bankmandiri.nbds.model;

import id.co.bankmandiri.nbds.model.FingerprintRequest;
import org.springframework.http.ResponseEntity;
import id.co.bankmandiri.nbds.model.FingerprintResponse;

public class FingerprintUsingPOSTP {

    private FingerprintRequest fingerprintRequest;

    public FingerprintUsingPOSTP() {

    }

    public FingerprintUsingPOSTP(FingerprintRequest fingerprintRequest) {
        this.fingerprintRequest = fingerprintRequest;
    }

    public FingerprintRequest getFingerprintRequest () {
        return fingerprintRequest;
    }

    public void setFingerprintRequest (FingerprintRequest fingerprintRequest) {
        this.fingerprintRequest = fingerprintRequest;
    }

}
