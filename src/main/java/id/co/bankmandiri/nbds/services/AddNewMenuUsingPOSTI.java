package id.co.bankmandiri.nbds.services;

import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOSTP;
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOSTResponseWrapper;

public interface AddNewMenuUsingPOSTI {

    public AddNewMenuUsingPOSTResponseWrapper execute(AddNewMenuUsingPOSTP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
