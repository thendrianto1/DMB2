package id.co.bankmandiri.nbds.services.impl;
 
import java.util.*;
 
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST2P;
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST2ResponseWrapper;
import id.co.bankmandiri.nbds.services.AddNewMenuUsingPOST2I;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class AddNewMenuUsingPOST2Impl implements AddNewMenuUsingPOST2I {
 
    private static final Log logger = LogFactory.getLog(AddNewMenuUsingPOST2Impl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public AddNewMenuUsingPOST2ResponseWrapper execute(AddNewMenuUsingPOST2P requestParams){
        //TODO
        return new AddNewMenuUsingPOST2ResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
