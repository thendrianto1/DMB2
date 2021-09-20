package id.co.bankmandiri.nbds.services;

import id.co.bankmandiri.nbds.model.LoginUsingPOSTP;
import id.co.bankmandiri.nbds.model.LoginUsingPOSTResponseWrapper;

public interface LoginUsingPOSTI {

    public LoginUsingPOSTResponseWrapper execute(LoginUsingPOSTP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
