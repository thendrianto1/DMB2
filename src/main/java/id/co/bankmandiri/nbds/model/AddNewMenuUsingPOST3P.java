package id.co.bankmandiri.nbds.model;

import id.co.bankmandiri.nbds.model.UserBranchRoleDTORequest;
import org.springframework.http.ResponseEntity;
import id.co.bankmandiri.nbds.model.UserBranchRoleDTOResponse;

public class AddNewMenuUsingPOST3P {

    private UserBranchRoleDTORequest userBranchRoleDTORequest;

    public AddNewMenuUsingPOST3P() {

    }

    public AddNewMenuUsingPOST3P(UserBranchRoleDTORequest userBranchRoleDTORequest) {
        this.userBranchRoleDTORequest = userBranchRoleDTORequest;
    }

    public UserBranchRoleDTORequest getUserBranchRoleDTORequest () {
        return userBranchRoleDTORequest;
    }

    public void setUserBranchRoleDTORequest (UserBranchRoleDTORequest userBranchRoleDTORequest) {
        this.userBranchRoleDTORequest = userBranchRoleDTORequest;
    }

}
