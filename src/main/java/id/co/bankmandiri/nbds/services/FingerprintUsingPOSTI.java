package id.co.bankmandiri.nbds.services;

import id.co.bankmandiri.nbds.model.FingerprintUsingPOSTP;
import id.co.bankmandiri.nbds.model.FingerprintUsingPOSTResponseWrapper;

public interface FingerprintUsingPOSTI {

    public FingerprintUsingPOSTResponseWrapper execute(FingerprintUsingPOSTP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
