package id.co.bankmandiri.nbds.model;

import org.springframework.http.ResponseEntity;
import id.co.bankmandiri.nbds.model.UserBranchResponse;

public class GetTellerListUsingGETP {

    private String branchNumber;
    private Boolean loginStatus;
    private Integer page;
    private String role;
    private String search;

    public GetTellerListUsingGETP() {

    }

    public GetTellerListUsingGETP(String branchNumber,Boolean loginStatus,Integer page,String role,String search) {
        this.branchNumber = branchNumber;
        this.loginStatus = loginStatus;
        this.page = page;
        this.role = role;
        this.search = search;
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
    public Integer getPage () {
        return page;
    }

    public void setPage (Integer page) {
        this.page = page;
    }
    public String getRole () {
        return role;
    }

    public void setRole (String role) {
        this.role = role;
    }
    public String getSearch () {
        return search;
    }

    public void setSearch (String search) {
        this.search = search;
    }

}
