package id.co.bankmandiri.nbds.model;

import id.co.bankmandiri.nbds.model.RoleDTORequest;
import org.springframework.http.ResponseEntity;
import id.co.bankmandiri.nbds.model.RoleDTOResponse;

public class AddNewMenuUsingPOST1P {

    private RoleDTORequest roleDTORequest;

    public AddNewMenuUsingPOST1P() {

    }

    public AddNewMenuUsingPOST1P(RoleDTORequest roleDTORequest) {
        this.roleDTORequest = roleDTORequest;
    }

    public RoleDTORequest getRoleDTORequest () {
        return roleDTORequest;
    }

    public void setRoleDTORequest (RoleDTORequest roleDTORequest) {
        this.roleDTORequest = roleDTORequest;
    }

}
