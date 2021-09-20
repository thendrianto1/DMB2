package id.co.bankmandiri.nbds.model;

import id.co.bankmandiri.nbds.model.LogoutRequest;
import org.springframework.http.ResponseEntity;

public class LogoutUsingPOSTP {

    private LogoutRequest logoutRequest;

    public LogoutUsingPOSTP() {

    }

    public LogoutUsingPOSTP(LogoutRequest logoutRequest) {
        this.logoutRequest = logoutRequest;
    }

    public LogoutRequest getLogoutRequest () {
        return logoutRequest;
    }

    public void setLogoutRequest (LogoutRequest logoutRequest) {
        this.logoutRequest = logoutRequest;
    }

}
