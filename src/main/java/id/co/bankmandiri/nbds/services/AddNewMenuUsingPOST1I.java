package id.co.bankmandiri.nbds.services;

import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST1P;
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST1ResponseWrapper;

public interface AddNewMenuUsingPOST1I {

    public AddNewMenuUsingPOST1ResponseWrapper execute(AddNewMenuUsingPOST1P requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
