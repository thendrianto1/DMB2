package id.co.bankmandiri.nbds.services;

import id.co.bankmandiri.nbds.model.GetTellerUserUsingGETP;
import id.co.bankmandiri.nbds.model.GetTellerUserUsingGETResponseWrapper;

public interface GetTellerUserUsingGETI {

    public GetTellerUserUsingGETResponseWrapper execute(GetTellerUserUsingGETP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
