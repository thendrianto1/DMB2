package id.co.bankmandiri.nbds.services;

import id.co.bankmandiri.nbds.model.VerifyUsingPOSTP;
import id.co.bankmandiri.nbds.model.VerifyUsingPOSTResponseWrapper;

public interface VerifyUsingPOSTI {

    public VerifyUsingPOSTResponseWrapper execute(VerifyUsingPOSTP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
