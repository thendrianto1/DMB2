package id.co.bankmandiri.nbds.model;

import id.co.bankmandiri.nbds.model.MenuDTORequest;
import org.springframework.http.ResponseEntity;
import id.co.bankmandiri.nbds.model.MenuDTOResponse;

public class AddNewMenuUsingPOSTP {

    private MenuDTORequest menuDTORequest;

    public AddNewMenuUsingPOSTP() {

    }

    public AddNewMenuUsingPOSTP(MenuDTORequest menuDTORequest) {
        this.menuDTORequest = menuDTORequest;
    }

    public MenuDTORequest getMenuDTORequest () {
        return menuDTORequest;
    }

    public void setMenuDTORequest (MenuDTORequest menuDTORequest) {
        this.menuDTORequest = menuDTORequest;
    }

}
