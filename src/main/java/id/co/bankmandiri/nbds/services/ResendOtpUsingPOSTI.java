package id.co.bankmandiri.nbds.services;

import id.co.bankmandiri.nbds.model.ResendOtpUsingPOSTP;
import id.co.bankmandiri.nbds.model.ResendOtpUsingPOSTResponseWrapper;

public interface ResendOtpUsingPOSTI {

    public ResendOtpUsingPOSTResponseWrapper execute(ResendOtpUsingPOSTP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
