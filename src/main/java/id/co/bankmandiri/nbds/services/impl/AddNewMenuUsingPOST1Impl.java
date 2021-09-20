package id.co.bankmandiri.nbds.services.impl;
 
import java.util.*;
 
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST1P;
import id.co.bankmandiri.nbds.model.AddNewMenuUsingPOST1ResponseWrapper;
import id.co.bankmandiri.nbds.services.AddNewMenuUsingPOST1I;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class AddNewMenuUsingPOST1Impl implements AddNewMenuUsingPOST1I {
 
    private static final Log logger = LogFactory.getLog(AddNewMenuUsingPOST1Impl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public AddNewMenuUsingPOST1ResponseWrapper execute(AddNewMenuUsingPOST1P requestParams){
        //TODO
        return new AddNewMenuUsingPOST1ResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
