package id.co.bankmandiri.nbds.model;

import id.co.bankmandiri.nbds.model.RoleMenuDTORequest;
import org.springframework.http.ResponseEntity;
import id.co.bankmandiri.nbds.model.RoleMenuDTOResponse;

public class AddNewMenuUsingPOST2P {

    private RoleMenuDTORequest roleMenuDTORequest;

    public AddNewMenuUsingPOST2P() {

    }

    public AddNewMenuUsingPOST2P(RoleMenuDTORequest roleMenuDTORequest) {
        this.roleMenuDTORequest = roleMenuDTORequest;
    }

    public RoleMenuDTORequest getRoleMenuDTORequest () {
        return roleMenuDTORequest;
    }

    public void setRoleMenuDTORequest (RoleMenuDTORequest roleMenuDTORequest) {
        this.roleMenuDTORequest = roleMenuDTORequest;
    }

}
