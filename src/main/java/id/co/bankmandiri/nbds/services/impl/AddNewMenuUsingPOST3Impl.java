package id.co.bankmandiri.nbds.services.impl;
 
import java.util.*;
 
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST3P;
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST3ResponseWrapper;
import id.co.bankmandiri.nbds.services.AddNewMenuUsingPOST3I;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class AddNewMenuUsingPOST3Impl implements AddNewMenuUsingPOST3I {
 
    private static final Log logger = LogFactory.getLog(AddNewMenuUsingPOST3Impl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public AddNewMenuUsingPOST3ResponseWrapper execute(AddNewMenuUsingPOST3P requestParams){
        //TODO
        return new AddNewMenuUsingPOST3ResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
