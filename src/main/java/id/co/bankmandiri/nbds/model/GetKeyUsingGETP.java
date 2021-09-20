package id.co.bankmandiri.nbds.model;

import org.springframework.http.ResponseEntity;

public class GetKeyUsingGETP {

    private String name;

    public GetKeyUsingGETP() {

    }

    public GetKeyUsingGETP(String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

}
