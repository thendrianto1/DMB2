package id.co.bankmandiri.nbds.services;

import id.co.bankmandiri.nbds.model.GetTellerListUsingGETP;
import id.co.bankmandiri.nbds.model.GetTellerListUsingGETResponseWrapper;

public interface GetTellerListUsingGETI {

    public GetTellerListUsingGETResponseWrapper execute(GetTellerListUsingGETP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
