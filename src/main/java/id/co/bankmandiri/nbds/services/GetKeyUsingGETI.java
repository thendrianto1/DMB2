package id.co.bankmandiri.nbds.services;

import id.co.bankmandiri.nbds.model.GetKeyUsingGETP;
import id.co.bankmandiri.nbds.model.GetKeyUsingGETResponseWrapper;

public interface GetKeyUsingGETI {

    public GetKeyUsingGETResponseWrapper execute(GetKeyUsingGETP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
