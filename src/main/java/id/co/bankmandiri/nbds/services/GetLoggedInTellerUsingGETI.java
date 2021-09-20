package id.co.bankmandiri.nbds.services;

import id.co.bankmandiri.nbds.model.GetLoggedInTellerUsingGETP;
import id.co.bankmandiri.nbds.model.GetLoggedInTellerUsingGETResponseWrapper;

public interface GetLoggedInTellerUsingGETI {

    public GetLoggedInTellerUsingGETResponseWrapper execute(GetLoggedInTellerUsingGETP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
