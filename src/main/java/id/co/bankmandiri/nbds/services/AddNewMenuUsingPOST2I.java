package id.co.bankmandiri.nbds.services;

import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST2P;
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST2ResponseWrapper;

public interface AddNewMenuUsingPOST2I {

    public AddNewMenuUsingPOST2ResponseWrapper execute(AddNewMenuUsingPOST2P requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
