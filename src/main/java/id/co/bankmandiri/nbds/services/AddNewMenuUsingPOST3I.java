package id.co.bankmandiri.nbds.services;

import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST3P;
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST3ResponseWrapper;

public interface AddNewMenuUsingPOST3I {

    public AddNewMenuUsingPOST3ResponseWrapper execute(AddNewMenuUsingPOST3P requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
