package id.co.bankmandiri.nbds.model;

import org.springframework.http.ResponseEntity;
import id.co.bankmandiri.nbds.model.BranchTellerCounterResponse;

public class GetLoggedInTellerUsingGETP {

    private String branchNumber;
    private Boolean loginStatus;
    private String role;

    public GetLoggedInTellerUsingGETP() {

    }

    public GetLoggedInTellerUsingGETP(String branchNumber,Boolean loginStatus,String role) {
        this.branchNumber = branchNumber;
        this.loginStatus = loginStatus;
        this.role = role;
    }

    public String getBranchNumber () {
        return branchNumber;
    }

    public void setBranchNumber (String branchNumber) {
        this.branchNumber = branchNumber;
    }
    public Boolean getLoginStatus () {
        return loginStatus;
    }

    public void setLoginStatus (Boolean loginStatus) {
        this.loginStatus = loginStatus;
    }
    public String getRole () {
        return role;
    }

    public void setRole (String role) {
        this.role = role;
    }

}
