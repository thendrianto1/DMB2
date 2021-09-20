package id.co.bankmandiri.nbds.services;

import id.co.bankmandiri.nbds.model.LogoutUsingPOSTP;
import id.co.bankmandiri.nbds.model.LogoutUsingPOSTResponseWrapper;

public interface LogoutUsingPOSTI {

    public LogoutUsingPOSTResponseWrapper execute(LogoutUsingPOSTP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
